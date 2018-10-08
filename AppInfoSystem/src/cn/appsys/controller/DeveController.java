package cn.appsys.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		if(pid.equals("")||pid==null) {			
			categorylist=appCategoryService.getAppCategoryListByParentId(null);
		}else {
			Integer parentId=Integer.parseInt(pid);
			categorylist=appCategoryService.getAppCategoryListByParentId(parentId);
		}
		
		return categorylist;
	}
	/**;
	 * 新增App页面跳转处理
	 */
	@RequestMapping(value="/appinfoadd",method=RequestMethod.GET)
	public String appinfoadd(Model model ) {
		App_Info appinfo =new App_Info();
		model.addAttribute(appinfo);
		List<App_Category> categoryLevel1List = null;//列出一级分类列表，注：二级和三级分类列表通过异步ajax获取
		//获取所有的一级分类
		categoryLevel1List=appCategoryService.getAppCategoryListByParentId(null);
		model.addAttribute("categoryLevel1List", categoryLevel1List);
		return "developer/appinfoadd";
	}
	/**
	 * 获取平台列表
	 */
	@RequestMapping(value="/datadictionarylist.json",method=RequestMethod.GET)
	@ResponseBody
	public List<Data_Dictionary> datadictionary(@RequestParam("tcode") String tcode) {
		List<Data_Dictionary> categorylist= new ArrayList<Data_Dictionary>();
		categorylist=dataDictionaryService.getDataDictionaryList(tcode);
		return categorylist;
	}
	/**
	 * 新增App保存页面
	 */
	@RequestMapping(value="/appinfoaddsave",method=RequestMethod.GET)
	public String appinfoaddsave(App_Info appInfo, HttpSession session, HttpServletRequest request,
			@RequestParam(value = "attachs", required = false) MultipartFile [] attachs) {
		App_Info appinfo =new App_Info();
		String a_logoPicPath = null;
		String workPicPath = null;
		String errorInfo = null;
		boolean flag = true;
		// 文件上传的真实路径
//		String path=request.getSession().getServletContext().getRealPath("static"+File.separator+"uploadfiles");
		String path = "E:" + File.separator + "pictures";
		// 判断文件是否为空
		for (int i = 0; i < attachs.length; i++) {
			MultipartFile attach = attachs[i];
			if (!attach.isEmpty()) {
				if (i == 0) {
					errorInfo = "uploadFileError";
				} else if (i == 1) {
					errorInfo = "uploadWpError";
				}
				String oldFileName = attach.getOriginalFilename();// 原文件名
				String prefix = FilenameUtils.getExtension(oldFileName);// 原文件名后缀
				int filessize = 500000;
				if (attach.getSize() > filessize) {
					request.setAttribute(errorInfo, "上传大小不得超过500Kb");
					flag = false;
				} else if (prefix.equalsIgnoreCase("jpg")// 上传图片格式不正确
						|| prefix.equalsIgnoreCase("png") || prefix.equalsIgnoreCase("jpeg")
						|| prefix.equalsIgnoreCase("peng")) {
					// 随机产生一个文件名
//					String fileName = System.currentTimeMillis() + RandomUtils.nextInt(1000000) + "_Personal.jpg";
					// 创建文件上传路径 如果不存在就创建一个
					File targetFile = new File(path);
					if (!targetFile.exists()) {
						targetFile.mkdirs();

					}
					// 保存
					try {
						attach.transferTo(targetFile);
					} catch (Exception e) {
						e.printStackTrace();
						request.setAttribute(errorInfo, "上传失败");
						flag = false;
					}
					if (i == 0) {
						// 把最终的文件路径和文件名封装成对象的图片属性值
//						idPicPath =path+File.separator+fileName;
						a_logoPicPath = path;
					} else if (i == 1) {

//						workPicPath=path+File.separator+fileName;
						workPicPath = path;
					}
				} else {
					request.setAttribute(errorInfo, "上传图片格式不正确");
					flag = false;
				}

			}

		}
		if (flag) {
			appinfo.setCreatedBy(((App_Info) session.getAttribute(Constants.USER_SESSION)).getId());
			appinfo.setCreationDate(new Date());
			appinfo.setLogoPicPath(a_logoPicPath);
			if (appInfoService.addinfoadd(appinfo) > 0) {
				return "developer/appinfolist";
			}
		}

		return "appinfoadd";
		
		
	}
	
	/**
	 * 验证Apk名称是否重复
	 */
	@RequestMapping(value="/apkexist.json",method=RequestMethod.GET)
	@ResponseBody
	public Map apkexist(@RequestParam("APKName") String APKName) {
		List<App_Info> appinfolist=new ArrayList<>();
		appinfolist=appInfoService.pageAppInfo(null, null, null, null, null, null, null, null, null);
		Map<String,String> APKname=  new HashMap<String,String>();
		//判断输入的名称是否为空
		if(APKName==null ||APKName.equals("")) {
			APKname.put("APKName", "empty");
			return APKname;
		}else {
			//获取所有的info对象进行循环遍历
			for(App_Info apinfo:appinfolist) {
				//如果对象的名称等于输入返回已经存在
				if(apinfo.getAPKName().equals(APKname)) {
					APKname.put("APKName", "exist");
					return APKname;
				}else {
					//否则返回不存在
					APKname.put("APKName", "noexist");
					return APKname;
				}
				
			}
			
		}
		
		return APKname;
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
