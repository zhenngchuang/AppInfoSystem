package cn.appsys.service.backend_user;

import org.springframework.stereotype.Service;

import cn.appsys.pojo.Backend_User;

public interface Backend_UserService {
	/**
	 * 根据用户编码和用户密码判断用户登录
	 * @param userCode
	 * @param userPassword
	 * @return
	 * @throws Exception
	 */
	public Backend_User login(String userCode, String userPassword) throws Exception;
}
