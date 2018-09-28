package cn.appsys.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


import cn.appsys.pojo.Backend_User;

import cn.appsys.pojo.Dev_User;
import cn.appsys.tools.Constants;




public class SysInterceptor extends HandlerInterceptorAdapter {
	private Logger logger = Logger.getLogger(SysInterceptor.class);
	
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception{
		logger.debug("SysInterceptor preHandle ==========================");
		HttpSession session = request.getSession();
		Dev_User devUser = (Dev_User)session.getAttribute(Constants.DEV_USER_SESSION);
		Backend_User backEndUser = (Backend_User)session.getAttribute(Constants.USER_SESSION);
		if(devUser == null) {
			response.sendRedirect(request.getContextPath()+"/403.jsp");
			return false;
		}
		if(backEndUser == null) {
			response.sendRedirect(request.getContextPath()+"/403.jsp");
			return false;
		}
		return true;
	}
}
