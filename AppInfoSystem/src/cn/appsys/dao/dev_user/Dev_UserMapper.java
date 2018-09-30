package cn.appsys.dao.dev_user;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.Dev_User;


public interface Dev_UserMapper {
	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public Dev_User getLoginUser(@Param("devCode")String devCode) throws Exception;

}
