package cn.sunline.assistant.dao;

import java.util.List;
import java.util.Map;

import cn.sunline.assistant.annotation.DeployDao;
import cn.sunline.assistant.bean.node.App_machine;
import cn.sunline.assistant.bean.node.App_system;
import cn.sunline.assistant.pojo.CommBeanswithsystem;

@DeployDao
public interface ICfgDao {
	List<App_system> selectAll_App_system();
	App_system selectOne_App_system_byId(String id);
	void save_App_system(App_system system);
	void upd_App_system(App_system system);
	void del_App_system(String id);
	
	List<CommBeanswithsystem> selectAll_Common(Map map);
	CommBeanswithsystem selectOne_Common_byId(Map map);
	void save_Common(Map map);
	void upd_Common(Map map);
	void del_Common(Map map);
	
	List<App_machine> selectAll_machine();
//	App_machine selectOne_machine_byId(String id);
//	void save_machine(App_machine machine);
//	void upd_machine(App_machine machine);
//	void del_machine(String id);
//	
}
