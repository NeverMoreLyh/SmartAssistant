package cn.sunline.assistant.service.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sunline.assistant.bean.comm.Menu;
import cn.sunline.assistant.dao.IMenuDao;
import cn.sunline.assistant.pojo.DNode;
import cn.sunline.assistant.service.IMenuService;

@Service("IMenuService")
public class MenuServiceImpl implements IMenuService{
	@Resource
	IMenuDao menuDao;

	@Override
	public DNode showMenuNode(String activeMenu) {
		Menu root = menuDao.selectMenuByType("0");
		//根据activeMenu获取父节点，约定菜单id为 父节点 + 三位序号。
		DNode node = resolveDNode(root.getMenuId(),getParentNodes(activeMenu));
		return node;
	}
	
	public List<String> getParentNodes(String activeMenu){
		if(activeMenu.length()%3!=0){
			throw new RuntimeException("菜单id不合法");
		}
		List<String> lst = new ArrayList<>();
		_getParentNodes(activeMenu,lst);
		return lst;
	}
	
	private void _getParentNodes(String activeMenu,List<String> lst){
		if(activeMenu.length()!=0){
			lst.add(activeMenu);
			activeMenu = activeMenu.substring(0,activeMenu.length()-3);
			_getParentNodes(activeMenu,lst);
		}
	}
	
	private DNode resolveDNode(String menuid, List<String> list){
		DNode  node = new DNode();
		Menu menu = menuDao.selectMenuById(menuid);
		node.setId(menu.getMenuId());
		node.setName(menu.getMenuName());
		node.setDesc(menu.getMenuDesc());
		if(list.contains(menuid)){
			if(menuid.length()==3)
				node.getAttributes().put("selected", "selected");
			node.getAttributes().put("active", "active");
		}
		node.getAttributes().put("class", menu.getMenuclass());
		node.getAttributes().put("link", menu.getMenulink());
		node.getAttributes().put("type", menu.getMenutype());
		List<Menu> menus = menuDao.selectMenusByPId(menuid);
		List<DNode> childs = new LinkedList<>();
		for(Menu m : menus){
			DNode tmpn = resolveDNode(m.getMenuId(), list);
			childs.add(tmpn);
		}
		node.setChilds(childs);
		return node;
	}

}
