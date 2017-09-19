package cn.sunline.assistant.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sunline.assistant.bean.comm.User;
import cn.sunline.assistant.service.IUserService;
import cn.sunline.assistant.utils.EncUtil;
@Controller
@RequestMapping("/login")
public class LoginController {
	
	private static Logger log = Logger.getLogger(LoginController.class);
	@Resource
	IUserService userservice;	
	
	@RequestMapping("/toLogin")
	public String toLogin(){
		log.debug("toLogin...");
		return "main/login";
	}
	@RequestMapping("/login")
	public String login(String username,String password,HttpSession session){
		String url="main/login";
		User user = userservice.selUser(username);
		if(user != null){
			String dbpass = user.getUserPasswd();
			if(dbpass.equals(EncUtil.decData(password))){
				//TODO  权限设置
				session.setAttribute("loginuser", user);
				url="redirect:tomain.do?menuid=001";
			}
		}
		return url;
	}
	
	@RequestMapping("/tomain")
	public String toMain(){
		log.debug("toMain...");
		return "main/main";
	}
	
}
