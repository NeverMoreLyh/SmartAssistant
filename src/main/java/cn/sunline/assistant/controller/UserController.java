package cn.sunline.assistant.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sunline.assistant.service.IUserService;
@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	IUserService userService;
	
	@RequestMapping("/showuser")
	public String showusers(HttpServletRequest hsr,Model model){
		return "user/showuserlist";
	}
	
	@RequestMapping("/showrole")
	public String showroles(HttpServletRequest hsr,Model model){
		return "user/showrolelist";
	}
	
	@RequestMapping("/createuser")
	public String createuser(HttpServletRequest hsr,Model model){
		return "user/createuser";
	}
	
	@RequestMapping("/createrole")
	public String createrole(HttpServletRequest hsr,Model model){
		return "user/createrole";
	}
	
}
