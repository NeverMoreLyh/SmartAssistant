package cn.sunline.assistant.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.sunline.assistant.bean.comm.User;
import cn.sunline.assistant.pojo.DNode;
import cn.sunline.assistant.service.IMenuService;

/**
 * @author LYH
 *	登录检查拦截器
 */
public class LoginInterceptor  implements HandlerInterceptor{
	private static Logger log = Logger.getLogger(LoginInterceptor.class);
	@Resource
	IMenuService menuService;
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		log.info("preHandle.....");
		User user = (User) request.getSession().getAttribute("loginuser");
		if(user == null){
			response.sendRedirect(request.getContextPath() + "/login/toLogin.do");
			return false;
		}else{
			String menuid = request.getParameter("menuid");
			DNode menuNode = (DNode) request.getSession().getAttribute("menunode");
			log.debug("activemenuid。。。。。。。。。"+menuid);
			if (menuid!=null){
				menuNode = menuService.showMenuNode(menuid);
			}else{
				if(menuNode==null){
					menuNode = menuService.showMenuNode("001");
				}
			}
			log.debug("menuNode。。。。。。。。。"+menuNode);
			request.getSession().setAttribute("menunode", menuNode);
			return true;
		}
	}

}
