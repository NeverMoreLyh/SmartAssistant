package cn.sunline.assistant.service;

import java.util.List;
import java.util.Map;

import cn.sunline.assistant.bean.node.App_machine;
import cn.sunline.assistant.bean.node.App_system;
import cn.sunline.assistant.pojo.CommBeanswithsystem;

public interface ICfgService {
	List<App_system> selectAllAppSystem();
	App_system findAppSystemById(String id);
	void deleteAppSystemById(String id);
	void updateAppSystem(App_system system);
	void saveAppSystem(App_system system);
	
	List<CommBeanswithsystem> selectAllCommonBean(Map map);
	CommBeanswithsystem findCommonBeanById(Map map);
	void deleteCommonBeanById(Map map);
	void updateCommonBean(Map map);
	void saveCommonBean(Map map);
	
	List<App_machine> selectAllMach();
}
