package cn.appsys.service.dev_user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.dev_user.Dev_UserMapper;
import cn.appsys.pojo.Dev_User;

@Service
public class Dev_UserServiceImpl implements Dev_UserService{
	@Resource
	private Dev_UserMapper devuserMapper;
	/**
	 * 开发者用户登录
	 */
	public Dev_User login(String devCode, String devPassword) throws Exception {
		Dev_User dev_User;
		dev_User = devuserMapper.getLoginUser(devCode);
		if (dev_User != null) {
			if (!dev_User.getDevPassword().equals(devPassword)) {
				dev_User = null;
			}
		}
		return dev_User;
	}

}
