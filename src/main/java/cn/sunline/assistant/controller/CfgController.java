package cn.sunline.assistant.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sunline.assistant.bean.comm.CommBean;
import cn.sunline.assistant.bean.node.App_machine;
import cn.sunline.assistant.bean.node.App_system;
import cn.sunline.assistant.pojo.CommBeanswithsystem;
import cn.sunline.assistant.service.ICfgService;
import cn.sunline.assistant.service.ISequenceService;
@RequestMapping("/conf")
@Controller
public class CfgController {
	
	private static Logger log = Logger.getLogger(CfgController.class);
	@Resource
	ISequenceService seqService;
	@Resource
	ICfgService cfgService;

	//管理系统
	@RequestMapping("/show_managerSystem")
	public String show_managerSystem(Model model){
		List<App_system> lst = cfgService.selectAllAppSystem();
		model.addAttribute("results",lst);
		return "conf/managerSystem_list";
	}
	
	@RequestMapping("/add_managerSystem")
	public String add_managerSystem(App_system system){
		log.debug("add_managerSystem begin。。。。。。");
		log.debug("App_system..."+system);
		system.setId(seqService.getSequenceWithName("system", "system"));
		cfgService.saveAppSystem(system);
		return "redirect:show_managerSystem.do";
	}
	
	@RequestMapping("/del_managerSystem")
	public String del_managerSystem(String id){
		cfgService.deleteAppSystemById(id);
		return "redirect:show_managerSystem.do";
	}
	
	@RequestMapping("/mod_managerSystem")
	public String mod_managerSystem(App_system system){
		cfgService.updateAppSystem(system);
		return "redirect:show_managerSystem.do";
	}
	
	@RequestMapping("/toadd_managerSystem")
	public String toadd_managerSystem(){
		return "conf/add_managerSystem";
	}
	
	@RequestMapping("/tomod_managerSystem")
	public String tomod_managerSystem(String id,Model model){
		model.addAttribute("result",cfgService.findAppSystemById(id));
		return "conf/mod_managerSystem";
	}
	//集群配置
	@RequestMapping("/show_cluster")
	public String show_cluster(Model model){
		List<CommBeanswithsystem> lst = show_common("t_cluster");
		model.addAttribute("results",lst);
		return "conf/cluster_list";
	}
	
	@RequestMapping("/add_cluster")
	public String add_cluster(CommBean bean){
		log.debug("add_cluster begin。。。。。。");
		log.debug("App_system..."+bean);
		add_common(bean, "t_cluster", "cluster");
		return "redirect:show_cluster.do";
	}
	
	@RequestMapping("/toadd_cluster")
	public String toadd_cluster(Model model){
		model.addAttribute("systems", cfgService.selectAllAppSystem());
		return "conf/add_cluster";
	}
	
	@RequestMapping("/del_cluster")
	public String del_cluster(String id){
		delete_common("t_cluster",id);
		return "redirect:show_cluster.do";
	}
	
	@RequestMapping("/mod_cluster")
	public String mod_cluster(CommBean bean){
		mod_common(bean,"t_cluster");
		return "redirect:show_cluster.do";
	}
	
	@RequestMapping("/tomod_cluster")
	public String tomod_cluster(String id,Model model){
		model.addAttribute("systems", cfgService.selectAllAppSystem());
		model.addAttribute("result",findCommById("t_cluster", id));
		return "conf/upd_cluster";
	}
	
	
	//运行环境配置
	
	@RequestMapping("/show_runEnv")
	public String show_runEnv(Model model){
		List<CommBeanswithsystem> lst = show_common("t_runEnv");
		model.addAttribute("results",lst);
		return "conf/runEnv_list";
	}
	
	@RequestMapping("/add_runEnv")
	public String add_runEnv(CommBean bean){
		log.debug("add_runEnv begin。。。。。。");
		log.debug("App_system..."+bean);
		add_common(bean, "t_runEnv", "runEnv");
		return "redirect:show_runEnv.do";
	}
	
	@RequestMapping("/toadd_runEnv")
	public String toadd_runEnv(Model model){
		model.addAttribute("systems", cfgService.selectAllAppSystem());
		return "conf/add_runEnv";
	}
	
	@RequestMapping("/del_runEnv")
	public String del_runEnv(String id){
		delete_common("t_runEnv",id);
		return "redirect:show_runEnv.do";
	}
	
	@RequestMapping("/mod_runEnv")
	public String mod_runEnv(CommBean bean){
		mod_common(bean,"t_runEnv");
		return "redirect:show_runEnv.do";
	}
	
	@RequestMapping("/tomod_runEnv")
	public String tomod_runEnv(String id,Model model){
		model.addAttribute("result",findCommById("t_runEnv", id));
		model.addAttribute("systems", cfgService.selectAllAppSystem());
		return "conf/upd_runEnv";
	}
	
	//运行环境配置
	
	@RequestMapping("/show_bizSystem")
	public String show_bizSystem(Model model){
		List<CommBeanswithsystem> lst = show_common("t_bizSystem");
		model.addAttribute("results",lst);
		return "conf/bizSystem_list";
	}
	
	@RequestMapping("/add_bizSystem")
	public String add_bizSystem(CommBean bean){
		log.debug("add_bizSystem begin。。。。。。");
		log.debug("App_system..."+bean);
		add_common(bean, "t_bizSystem", "bizSystem");
		return "redirect:show_bizSystem.do";
	}
	
	@RequestMapping("/toadd_bizSystem")
	public String toadd_bizSystem(Model model){
		model.addAttribute("systems", cfgService.selectAllAppSystem());
		return "conf/add_bizSystem";
	}
	
	@RequestMapping("/del_bizSystem")
	public String del_bizSystem(String id){
		delete_common("t_bizSystem",id);
		return "redirect:show_bizSystem.do";
	}
	
	@RequestMapping("/mod_bizSystem")
	public String mod_bizSystem(CommBean bean){
		mod_common(bean,"t_bizSystem");
		return "redirect:show_bizSystem.do";
	}
	
	@RequestMapping("/tomod_bizSystem")
	public String tomod_bizSystem(String id,Model model){
		model.addAttribute("systems", cfgService.selectAllAppSystem());
		model.addAttribute("result",findCommById("t_bizSystem", id));
		return "conf/upd_bizSystem";
	}
	
	//数据中心配置
	
	@RequestMapping("/show_dataCenter")
	public String show_dataCenter(Model model){
		List<CommBeanswithsystem> lst = show_common("t_dataCenter");
		model.addAttribute("results",lst);
		return "conf/dataCenter_list";
	}
	
	@RequestMapping("/add_dataCenter")
	public String add_dataCenter(CommBean bean){
		log.debug("add_dataCenter begin。。。。。。");
		log.debug("App_system..."+bean);
		add_common(bean, "t_dataCenter", "dataCenter");
		return "redirect:show_dataCenter.do";
	}
	
	@RequestMapping("/toadd_dataCenter")
	public String toadd_dataCenter(Model model){
		model.addAttribute("systems", cfgService.selectAllAppSystem());
		return "conf/add_dataCenter";
	}
	
	@RequestMapping("/del_dataCenter")
	public String del_dataCenter(String id){
		delete_common("t_dataCenter",id);
		return "redirect:show_dataCenter.do";
	}
	
	@RequestMapping("/mod_dataCenter")
	public String mod_dataCenter(CommBean bean){
		mod_common(bean,"t_dataCenter");
		return "redirect:show_dataCenter.do";
	}
	
	@RequestMapping("/tomod_dataCenter")
	public String tomod_dataCenter(String id,Model model){
		model.addAttribute("systems", cfgService.selectAllAppSystem());
		model.addAttribute("result",findCommById("t_dataCenter", id));
		return "conf/upd_dataCenter";
	}
	
	public void mod_common(CommBean bean,String t_name){
		Map map = new HashMap<>();
		map.put("id", bean.getId());
		map.put("name", bean.getName());
		map.put("sysid", bean.getSysid());
		map.put("remark", bean.getRemark());
		map.put("tname", t_name);
		cfgService.updateCommonBean(map);
	}
	
	public void add_common(CommBean bean,String t_name,String seqid){
		Map map = new HashMap<>();
		map.put("id", seqService.getSequenceWithName(seqid,seqid));
		map.put("name", bean.getName());
		map.put("remark", bean.getRemark());
		map.put("sysid", bean.getSysid());
		map.put("tname", t_name);
		cfgService.saveCommonBean(map);
	}
	
	public List<CommBeanswithsystem> show_common(String t_name){
		Map map = new HashMap<>();
		map.put("tname", t_name);
		return cfgService.selectAllCommonBean(map);
	}
	
	public void delete_common(String t_name, String id){
		Map map = new HashMap<>();
		map.put("id", id);
		map.put("tname", t_name);
		cfgService.deleteCommonBeanById(map);
	}
	
	public CommBeanswithsystem findCommById(String t_name, String id){
		Map map = new HashMap<>();
		map.put("id", id);
		map.put("tname", t_name);
		return cfgService.findCommonBeanById(map);
	}
	
	//服务器配置
	@RequestMapping("/show_machine")
	public String show_machine(Model model){
		List<App_machine> lst = cfgService.selectAllMach();
		model.addAttribute("results",lst);
		return "conf/machine_list";
	}
	
	
}
