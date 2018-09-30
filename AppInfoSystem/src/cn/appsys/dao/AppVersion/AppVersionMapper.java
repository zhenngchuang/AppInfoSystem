package cn.appsys.dao.AppVersion;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.App_Version;

public interface AppVersionMapper {
	//����һ���汾��Ϣ��Mapper�ӿ�
	/**
	 * ��ȡApp_Version����
	 * @param appId
	 * @return
	 */
	public List<App_Version> getAppVersionList(@Param("appId")Integer appId);
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
	public int getVersionCountByAppId(@Param("appId")Integer appId);
	/**
	 * ɾ��App_Version
	 * @param appId
	 * @return
	 */
	public int deleteVersionByAppId(@Param("appId")Integer appId);
	/**
	 * ͨ��id��App_Version
	 * @param id
	 * @return
	 */
	public App_Version getAppVersionById(@Param("id")Integer id);
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
	public int deleteApkFile(@Param("id")Integer id);

}
