package cn.appsys.service.AppVersion;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.App_Version;

public interface AppVersionService {
	/**
	 * 获取App_Version集合
	 * @param appId
	 * @return
	 */
	public List<App_Version> getAppVersionList(Integer appId);
	/**
	 * 添加App_Version
	 * @param appVersion
	 * @return
	 */
	public int add(App_Version appVersion);
	/**
	 * 通过appid查App_Version
	 * @param appId
	 * @return
	 */
	public int getVersionCountByAppId(Integer appId);
	/**
	 * 删除App_Version
	 * @param appId
	 * @return
	 */
	public int deleteVersionByAppId(Integer appId);
	/**
	 * 通过id查App_Version
	 * @param id
	 * @return
	 */
	public App_Version getAppVersionById(Integer id);
	/**
	 * 更新App_Version
	 * @param appVersion
	 * @return
	 */
	public int modify(App_Version appVersion);
	/**
	 * 通过id删除apk
	 * @param id
	 * @return
	 */
	public int deleteApkFile(Integer id);

}
