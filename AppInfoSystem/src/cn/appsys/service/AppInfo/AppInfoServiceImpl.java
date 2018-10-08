package cn.appsys.service.AppInfo;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.appsys.dao.AppInfo.App_InfoMapper;
import cn.appsys.pojo.App_Info;
@Service
@Transactional
public class AppInfoServiceImpl implements AppInfoService {
	@Resource
	private App_InfoMapper appinfomapper;
	/**
	 * 获取所有的APP信息
	 */
	@Override
	public App_Info appinfoList(Integer id) {	
		return appinfomapper.appinfolist(id);
	}
	@Override
	/**
	 * 增加一个app信息
	 */
	public int addinfoadd(App_Info appinfo) {
		
		return appinfomapper.addinfoadd(appinfo);
	}
	@Override
	/**
	 * 修改一个app信息
	 */
	public int modifyAppinfo(App_Info appinfo) {
		// TODO Auto-generated method stub
		return appinfomapper.modifyAppinfo(appinfo);
	}
	@Override
	/**
	 * 分页显示
	 */
	public List<App_Info> pageAppInfo(String softwareName, Integer status, Integer flatformId, Integer categoryLevel1,
			Integer categoryLevel2, Integer categoryLevel3, Integer currentPageNo,Integer pageSize,Integer id) {	
		return appinfomapper.pageAppInfo(softwareName, status, flatformId, categoryLevel1, categoryLevel2,
				categoryLevel3, (currentPageNo-1)*pageSize,pageSize,id);
	}
	@Override
	/**
	 * 统计条数
	 */
	
	public int appCount(String softwareName, Integer status, Integer flatformId, Integer categoryLevel1,
			Integer categoryLevel2, Integer categoryLevel3) {
		
		return appinfomapper.appCount(softwareName, status, flatformId, categoryLevel1, categoryLevel2, categoryLevel3);
	}
	@Override
	/**
	 * 更新状态
	 */
	public int updateSatus(Integer status, Integer id) throws Exception {
		
		return appinfomapper.updateSatus(status, id);
	}
	

}
