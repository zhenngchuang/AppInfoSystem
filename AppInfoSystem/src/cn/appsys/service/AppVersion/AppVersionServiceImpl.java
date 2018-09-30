package cn.appsys.service.AppVersion;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.AppVersion.AppVersionMapper;
import cn.appsys.pojo.App_Version;
@Service
public class AppVersionServiceImpl implements AppVersionService {
	@Resource
	private AppVersionMapper appVersionMapper;

	@Override
	public List<App_Version> getAppVersionList(Integer appId) {
		// TODO Auto-generated method stub
		return appVersionMapper.getAppVersionList(appId);
	}

	@Override
	public int add(App_Version appVersion) {
		// TODO Auto-generated method stub
		return appVersionMapper.add(appVersion);
	}

	@Override
	public int getVersionCountByAppId(Integer appId) {
		// TODO Auto-generated method stub
		return appVersionMapper.getVersionCountByAppId(appId);
	}

	@Override
	public int deleteVersionByAppId(Integer appId) {
		// TODO Auto-generated method stub
		return appVersionMapper.deleteVersionByAppId(appId);
	}

	@Override
	public App_Version getAppVersionById(Integer id) {
		// TODO Auto-generated method stub
		return appVersionMapper.getAppVersionById(id);
	}

	@Override
	public int modify(App_Version appVersion) {
		// TODO Auto-generated method stub
		return appVersionMapper.modify(appVersion);
	}

	@Override
	public int deleteApkFile(Integer id) {
		// TODO Auto-generated method stub
		return appVersionMapper.deleteApkFile(id);
	}
	
	
}
