package cn.sunline.assistant.dao;

import java.util.List;

import cn.sunline.assistant.annotation.AssistantDao;
import cn.sunline.assistant.bean.comm.Menu;

@AssistantDao
public interface IMenuDao {
	List<Menu> selectAll();
	Menu selectMenuById(String menuid);
	List<Menu> selectMenusByPId(String pid);
	Menu selectMenuByType(String menutype);
}
