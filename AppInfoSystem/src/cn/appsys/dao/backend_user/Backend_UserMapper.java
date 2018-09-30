package cn.appsys.dao.backend_user;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.Backend_User;

public interface Backend_UserMapper {
	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public Backend_User getLoginUser(@Param("userCode")String userCode) throws Exception;
}
