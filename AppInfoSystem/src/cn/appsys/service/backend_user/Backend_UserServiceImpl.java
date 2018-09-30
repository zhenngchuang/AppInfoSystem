package cn.appsys.service.backend_user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.backend_user.Backend_UserMapper;
import cn.appsys.pojo.Backend_User;
@Service
public class Backend_UserServiceImpl implements Backend_UserService{
	@Resource
	private Backend_UserMapper backenduserMapper;
	/**
	 * 后台用户登录
	 */
	public Backend_User login(String userCode, String userPassword)
			throws Exception {
		Backend_User backend_User;
		backend_User = backenduserMapper.getLoginUser(userCode);
		if (backend_User != null) {
			if (!backend_User.getUserPassword().equals(userPassword)) {
				backend_User = null;
			}
		}
		return backend_User;
	}

}
