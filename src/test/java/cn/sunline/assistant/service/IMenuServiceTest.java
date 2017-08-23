package cn.sunline.assistant.service;

import javax.annotation.Resource;

import org.junit.Test;

import cn.sunline.assistant.base.SpringJunitBaseTest;
import cn.sunline.assistant.pojo.DNode;
import cn.sunline.assistant.service.impl.MenuServiceImpl;

public class IMenuServiceTest extends SpringJunitBaseTest {

	@Resource
	IMenuService menuService;
	MenuServiceImpl impl = new MenuServiceImpl();
	
	@Test
	public void testshowMenuNode() {
		DNode node = menuService.showMenuNode("002001");
		System.out.println(node.toJsonString());
	}
	@Test
	public void testgetParentNodes(){
		System.out.println(impl.getParentNodes("002001"));
	}

}
