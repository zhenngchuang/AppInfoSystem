package cn.appsys.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.appsys.pojo.App_Category;
import cn.appsys.pojo.App_Info;
import cn.appsys.pojo.App_Version;
import cn.appsys.pojo.Data_Dictionary;
import cn.appsys.service.AppCategory.AppCategoryService;
import cn.appsys.service.AppInfo.AppInfoService;
import cn.appsys.service.AppVersion.AppVersionService;
import cn.appsys.service.DataDictionary.DataDictionaryService;
import cn.appsys.tools.Constants;
import cn.appsys.tools.PageSupport;




@Controller
@RequestMapping("sys/dev")
//创建一个前台开发者的Controller文件
public class DeveController {
	@Resource
	private AppInfoService appInfoService;	
	@Resource
	private AppVersionService appVersionService;
	@Resource
	private DataDictionaryService dataDictionaryService;
	@Resource
	 private AppCategoryService appCategoryService;
	/**
	 * App列表显示页面
	 * @return
	 */
	@RequestMapping(value="/list")
	public String applist(Model model,@RequestParam(value="pageIndex",required=false) String pageIndex,
			@RequestParam(value="querySoftwareName",required=false) String softwareName,
			@RequestParam(value="queryStatus",required=false) String queryStatus,
			@RequestParam(value="queryFlatformId",required=false) String queryFlatformId,
			@RequestParam(value="queryCategoryLevel1",required=false) String queryCategoryLevel1,
			@RequestParam(value="queryCategoryLevel2",required=false) String queryCategoryLevel2,
			@RequestParam(value="queryCategoryLevel3",required=false) String queryCategoryLevel3,
			@RequestParam(value="appinfoid",required=false) String appinfoid
			) {
		Integer status = null;
		Integer flatformId=null;
		Integer categoryLevel1=null;
		Integer categoryLevel2=null;
		Integer categoryLevel3=null;
		Integer id = null;
		
		if(queryStatus != null && queryStatus !="") {
			 status=Integer.parseInt(queryStatus);
		}
		if(queryFlatformId !=null && queryFlatformId !="") {
			 flatformId=Integer.parseInt(queryFlatformId);		
		}
		if(queryCategoryLevel1 !=null && queryCategoryLevel1 !="") {
			categoryLevel1=Integer.parseInt(queryCategoryLevel1);	
		}
		if(queryCategoryLevel2 !=null && queryCategoryLevel2 !="") {
			categoryLevel2=Integer.parseInt(queryCategoryLevel2);	
		}
		if(queryCategoryLevel3 !=null && queryCategoryLevel3 !="") {
			categoryLevel3=Integer.parseInt(queryCategoryLevel3);		
		}
		if(appinfoid !=null && appinfoid !="") {
			id=Integer.parseInt(appinfoid);		
		}
		List<App_Info> appinfolist=new ArrayList<>();	
		// 设置页面容量
		int pageSize = Constants.pageSize;
		// 当前页码
		int currentPageNo = 1;
		if (pageIndex != null) {
			try {
				currentPageNo = Integer.valueOf(pageIndex);
			} catch (NumberFormatException e) {
				return "redirect:/error";
			}			
		}
		// 总量表
		int totalCount =appInfoService.appCount(softwareName, status, flatformId, 
									categoryLevel1, categoryLevel2, categoryLevel3);
		// 总页数
				PageSupport pages = new PageSupport();
				pages.setCurrentPageNo(currentPageNo);
				pages.setPageSize(pageSize);
				pages.setTotalCount(totalCount);
				int totalPageCount = pages.getTotalPageCount();
				// 控制首页和尾页
				if (currentPageNo < 1) {
					currentPageNo = 1;
				} else if (currentPageNo > totalPageCount) {
					currentPageNo = totalPageCount;
				}
		appinfolist=appInfoService.pageAppInfo(softwareName, status, flatformId, categoryLevel1, 
								categoryLevel2, categoryLevel3, currentPageNo, pageSize,id);
		//获取平台名称集合
		List<Data_Dictionary> statusList=new ArrayList<Data_Dictionary>();
		statusList=dataDictionaryService.getDataDictionaryList("APP_STATUS");
		List<Data_Dictionary> flatFormList=new ArrayList<Data_Dictionary>();
		flatFormList=dataDictionaryService.getDataDictionaryList("APP_FLATFORM");	
		List<App_Category> categoryLevel1List = null;//列出一级分类列表，注：二级和三级分类列表通过异步ajax获取
		List<App_Category> categoryLevel2List = null;
		List<App_Category> categoryLevel3List = null;
		//获取所有的一级分类
		categoryLevel1List=appCategoryService.getAppCategoryListByParentId(null);
		//调用方法获取二级以及三级分类
		if(queryCategoryLevel2 != null && !queryCategoryLevel2.equals("")){
			categoryLevel2List = getcategory(categoryLevel1.toString());
			model.addAttribute("categoryLevel2List", categoryLevel2List);
		}
		if(queryCategoryLevel3 != null && !queryCategoryLevel3.equals("")){
			categoryLevel3List = getcategory(categoryLevel2.toString());
			model.addAttribute("categoryLevel3List", categoryLevel3List);
		}
		model.addAttribute("pages", pages);
		model.addAttribute("appInfoList",appinfolist);
		model.addAttribute("flatFormList",flatFormList);
		model.addAttribute("statusList",statusList);
		model.addAttribute("categoryLevel1List", categoryLevel1List);
		model.addAttribute("queryCategoryLevel1", queryCategoryLevel1);
		model.addAttribute("queryCategoryLevel2", queryCategoryLevel2);
		model.addAttribute("queryCategoryLevel3", queryCategoryLevel3);
		return "developer/appinfolist";
	}
	
	public List<App_Category> getCategoryList (String pid){
		List<App_Category> categoryLevelList = null;
		try {
			categoryLevelList = appCategoryService.getAppCategoryListByParentId(pid==null?null:Integer.parseInt(pid));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return categoryLevelList;
	}
	/**
	 * 获取分类的处理方法
	 */
	@RequestMapping(value="/categorylevellist.json",method=RequestMethod.GET)
	@ResponseBody
	public List<App_Category> getcategory(@RequestParam("pid") String pid) {
		List<App_Category> categorylist= new ArrayList<App_Category>();
		Integer parentId=Integer.parseInt(pid);
		categorylist=appCategoryService.getAppCategoryListByParentId(parentId);
		return categorylist;
	}
	/**;
	 * 新增App页面跳转处理
	 */
	@RequestMapping(value="/appinfoadd",method=RequestMethod.GET)
	public String appinfoadd() {
		return "developer/appinfoadd";
	}
	
	/**
	 * 新增App保存页面
	 */
	@RequestMapping(value="/appinfoaddsave",method=RequestMethod.POST)
	public String appinfoaddsave(App_Info appInfo, HttpSession session, HttpServletRequest request,
			@RequestParam(value = "a_logoPicPath", required = false) MultipartFile attach) {
		return "developer/appinfolist";
	}
	
	/**
	 * 详细信息页面跳转
	 */
	@RequestMapping(value="/appview",method=RequestMethod.GET)
	public String appview(@RequestParam (value="appinfoid") String appinfoid,Model model) {
		//根据页面id获取单条详细信息
		App_Info appinfo= new App_Info();
		Integer id = null;
		if(appinfoid !=null && appinfoid !="") {
			id=Integer.parseInt(appinfoid);		
		}
		appinfo=appInfoService.appinfoList(id);
		List <App_Version> appversionlist=new ArrayList<App_Version>();
		appversionlist=appVersionService.getAppVersionList(appinfo.getId());
		model.addAttribute("appInfo",appinfo);
		model.addAttribute("appVersion", appversionlist);
		return "developer/appinfoview";
	}
}
