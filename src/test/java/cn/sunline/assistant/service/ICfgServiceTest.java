package cn.sunline.assistant.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import cn.sunline.assistant.base.SpringJunitBaseTest;
import cn.sunline.assistant.bean.comm.CommBean;
import cn.sunline.assistant.bean.node.App_system;
import cn.sunline.assistant.pojo.CommBeanswithsystem;

public class ICfgServiceTest extends SpringJunitBaseTest {
	@Resource
	ICfgService cfgService;
	
	@Test
	public void testSelectAllBizSystem() {
		List<App_system> lst = cfgService.selectAllAppSystem();
		System.out.println(lst);
//		fail("Not yet implemented");
	}

	@Test
	public void testFindAppSystemById() {
		String id="100";
		App_system App_system = cfgService.findAppSystemById(id);
		System.out.println(App_system);
//		fail("Not yet implemented");
	}

	@Test
	public void testDeleteAppSystemById() {
		String id="200";
		cfgService.deleteAppSystemById(id);
		App_system App_system = cfgService.findAppSystemById(id);
		System.out.println(App_system);
//		fail("Not yet implemented");
	}
	
	@Test
	public void testSaveAppSystem() {
		App_system App_system  = new App_system();
		App_system.setId("200");
		App_system.setName("村镇银行");
		App_system.setRemark("村镇银行");
		cfgService.saveAppSystem(App_system);
		testSelectAllBizSystem();
//		fail("Not yet implemented");
	}

	@Test
	public void testUpdateAppSystem() {
		App_system App_system  = new App_system();
		App_system.setId("200");
		App_system.setName("村镇银行123");
		App_system.setRemark("村镇银行123");
		cfgService.updateAppSystem(App_system);
		testSelectAllBizSystem();
	}
	
	
	@Test
	public void testSelectAllCommon() {
		Map map = new HashMap<>();
		map.put("tname", "t_bizSystem");
		List<CommBeanswithsystem> lst = cfgService.selectAllCommonBean(map);
		System.out.println(lst);
	}


}
