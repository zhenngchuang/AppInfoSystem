package cn.appsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	/**
	 * ��̨����ϵͳ���
	 */
	@RequestMapping("managerlogin.html")
	public String managerlogin() {
		return "backendlogin";
	}
	/**
	 * ������ϵͳ���
	 */
	@RequestMapping("devlogin.html")
	public String devlogin() {
		return "devlogin";
	}
	
	/**
	 * ��̨�����¼
	 */
	@RequestMapping(value="Mdologin.html",method=RequestMethod.POST)
	public String Mlogin() {
		return "backend/main";
	}
	/**
	 * �����ߵ�¼
	 */
	@RequestMapping(value="Ddologin.html",method=RequestMethod.POST)
	public String Dlogin() {
		return "developer/main";
	}
}
