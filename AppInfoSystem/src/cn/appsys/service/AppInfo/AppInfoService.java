package cn.appsys.service.AppInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.App_Info;

public interface AppInfoService {
	//创建一个APpInfo的service
	/**
	 * 获取所有的app信息的列表
	 */
	public App_Info appinfoList( Integer id);
	/**
	 * 增加一个APP信息列表
	 */
	public int addinfoadd(App_Info appinfo );
	/**
	 * 修改App信息
	 */
	public int modifyAppinfo(App_Info appinfo);
	/**
	 * 分页显示App信息列表
	 */
	public List<App_Info> pageAppInfo(String softwareName,
			 Integer status, Integer flatformId, Integer categoryLevel1 ,
			 Integer categoryLevel2 , Integer categoryLevel3 ,
			Integer currentPageNo,Integer pageSize,Integer id
			);
	
	/**
	 * 统计总记录条数
	 */
	public int appCount(String softwareName,
			 Integer status,Integer flatformId, Integer categoryLevel1 ,
			 Integer categoryLevel2 , Integer categoryLevel3);
	
	/**
	 * 更新app状态
	 * @param status
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int updateSatus(Integer status,Integer id)throws Exception;

}
