package cn.appsys.dao.AppInfo;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.appsys.pojo.App_Info;
@Repository
public interface App_InfoMapper {
	//APP信息的Mapper接口
	/**
	 * 获取所有的app信息的列表
	 */
	public App_Info  appinfolist(@Param("id") Integer id);
	/**
	 * 统计总记录条数 */
	public int appCount(@Param("softwareName")String softwareName,
			@Param("status") Integer status,@Param("flatformId") Integer flatformId,@Param("categoryLevel1") Integer categoryLevel1 ,
			@Param("categoryLevel2") Integer categoryLevel2 ,@Param("categoryLevel3") Integer categoryLevel3);
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
	public List<App_Info> pageAppInfo(@Param("softwareName")String softwareName,
			@Param("status") Integer status,@Param("flatformId") Integer flatformId,@Param("categoryLevel1") Integer categoryLevel1 ,
			@Param("categoryLevel2") Integer categoryLevel2 ,@Param("categoryLevel3") Integer categoryLevel3 ,
			@Param("from")Integer currentPageNo,@Param("pageSize") Integer pageSize,@Param("id") Integer id
			);
	/**
	 * 更新app状态
	 * @param status
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int updateSatus(@Param(value="status")Integer status,@Param(value="id")Integer id)throws Exception;

}
