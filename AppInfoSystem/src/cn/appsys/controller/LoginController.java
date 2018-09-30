package cn.appsys.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appsys.pojo.Backend_User;
import cn.appsys.pojo.Dev_User;
import cn.appsys.service.backend_user.Backend_UserService;
import cn.appsys.service.dev_user.Dev_UserService;
import cn.appsys.tools.Constants;

@Controller
public class LoginController {
	@Resource
	private Backend_UserService backenduserService;
	@Resource
	private Dev_UserService devuserservice;
	/**
	 * 后台管理系统入口
	 */
	@RequestMapping("managerlogin.html")
	public String managerlogin() {
		return "backendlogin";
	}
	/**
	 * 开发者系统入口
	 */
	@RequestMapping("devlogin.html")
	public String devlogin() {
		return "devlogin";
	}
	
	/**
	 * 后台管理登录
	 */
	@RequestMapping(value="Mdologin.html",method=RequestMethod.POST)
	public String Mlogin(@RequestParam String userCode,
						@RequestParam String userPassword,
						HttpServletRequest request,
						HttpSession session)throws Exception {
		Backend_User backend_User = backenduserService.login(userCode, userPassword);
		if (backend_User != null) {
			session.setAttribute(Constants.USER_SESSION, backend_User);
			return "redirect:/userinfolist";
		}else{
			request.setAttribute("error", "用户名或密码不正确");
			return "backendlogin";
		}
	}
	@RequestMapping(value="/userinfolist",method=RequestMethod.GET)
	public String userinfo(HttpSession session){
		return "/backend/main";
	}
	
	@RequestMapping(value="/manager/logout")
	public String logout(HttpSession session){
		//清除session
		session.removeAttribute(Constants.USER_SESSION);
		return "backendlogin";
	}
	
	/**
	 * 开发者登录
	 */
	@RequestMapping(value="Ddologin.html",method=RequestMethod.POST)
	public String Dlogin(@RequestParam String devCode,
						@RequestParam String devPassword,
						HttpServletRequest request,
						HttpSession session)throws Exception  {
		Dev_User dev_User = devuserservice.login(devCode, devPassword);
		if (dev_User != null) {
			session.setAttribute(Constants.DEV_USER_SESSION, dev_User);
			return "redirect:/appinfolist";
		}else{
			request.setAttribute("error", "用户名或密码不正确");
			return "devlogin";
		}
	}
	@RequestMapping(value="/appinfolist",method=RequestMethod.GET)
	public String appinfo(HttpSession session){
		return "/developer/main";
	}
}
