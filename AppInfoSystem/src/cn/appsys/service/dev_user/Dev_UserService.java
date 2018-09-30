package cn.appsys.service.dev_user;

import org.springframework.stereotype.Service;

import cn.appsys.pojo.Dev_User;

public interface Dev_UserService {
	/**
	 * 根据用户编码和用户密码判断用户登录
	 * @param userCode
	 * @param userPassword
	 * @return
	 * @throws Exception
	 */
	public Dev_User login(String devCode, String devPassword) throws Exception;

}
