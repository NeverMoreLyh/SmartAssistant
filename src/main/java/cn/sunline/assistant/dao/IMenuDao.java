package cn.sunline.assistant.dao;

import java.util.List;

import cn.sunline.assistant.annotation.DeployDao;
import cn.sunline.assistant.bean.comm.Menu;

@DeployDao
public interface IMenuDao {
	List<Menu> selectAll();
	Menu selectMenuById(String menuid);
	List<Menu> selectMenusByPId(String pid);
	Menu selectMenuByType(String menutype);
}
