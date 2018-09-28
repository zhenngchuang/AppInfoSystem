package cn.appsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
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
	public String Mlogin() {
		return "backend/main";
	}
	/**
	 * 开发者登录
	 */
	@RequestMapping(value="Ddologin.html",method=RequestMethod.POST)
	public String Dlogin() {
		return "developer/main";
	}
}
