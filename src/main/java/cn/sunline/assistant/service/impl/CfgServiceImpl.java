package cn.sunline.assistant.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sunline.assistant.bean.node.App_machine;
import cn.sunline.assistant.bean.node.App_system;
import cn.sunline.assistant.dao.ICfgDao;
import cn.sunline.assistant.pojo.CommBeanswithsystem;
import cn.sunline.assistant.service.ICfgService;

@Service("ICfgService")
public class CfgServiceImpl implements ICfgService{
	@Resource
	ICfgDao cfgDao;
	@Override
	public void updateAppSystem(App_system system) {
		cfgDao.upd_App_system(system);		
	}
	@Override
	public void saveAppSystem(App_system system) {
		cfgDao.save_App_system(system);
	}
	@Override
	public App_system findAppSystemById(String id) {
		return cfgDao.selectOne_App_system_byId(id);
	}
	@Override
	public void deleteAppSystemById(String id) {
		cfgDao.del_App_system(id);
	}
	@Override
	public List<App_system> selectAllAppSystem() {
		return cfgDao.selectAll_App_system();
	}
	@Override
	public List<CommBeanswithsystem> selectAllCommonBean(Map map) {
		return cfgDao.selectAll_Common(map);
	}
	@Override
	public CommBeanswithsystem findCommonBeanById(Map map) {
		return cfgDao.selectOne_Common_byId(map);
	}
	@Override
	public void deleteCommonBeanById(Map map) {
		cfgDao.del_Common(map);
	}
	@Override
	public void updateCommonBean(Map map) {
		cfgDao.upd_Common(map);
	}
	@Override
	public void saveCommonBean(Map map) {
		cfgDao.save_Common(map);
	}
	@Override
	public List<App_machine> selectAllMach() {
		return cfgDao.selectAll_machine();
	}

	
}
