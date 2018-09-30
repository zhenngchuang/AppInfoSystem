package cn.appsys.service.AppVersion;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.App_Version;

public interface AppVersionService {
	/**
	 * ��ȡApp_Version����
	 * @param appId
	 * @return
	 */
	public List<App_Version> getAppVersionList(Integer appId);
	/**
	 * ���App_Version
	 * @param appVersion
	 * @return
	 */
	public int add(App_Version appVersion);
	/**
	 * ͨ��appid��App_Version
	 * @param appId
	 * @return
	 */
	public int getVersionCountByAppId(Integer appId);
	/**
	 * ɾ��App_Version
	 * @param appId
	 * @return
	 */
	public int deleteVersionByAppId(Integer appId);
	/**
	 * ͨ��id��App_Version
	 * @param id
	 * @return
	 */
	public App_Version getAppVersionById(Integer id);
	/**
	 * ����App_Version
	 * @param appVersion
	 * @return
	 */
	public int modify(App_Version appVersion);
	/**
	 * ͨ��idɾ��apk
	 * @param id
	 * @return
	 */
	public int deleteApkFile(Integer id);

}
