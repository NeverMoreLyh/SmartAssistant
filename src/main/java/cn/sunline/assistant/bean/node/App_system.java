package cn.sunline.assistant.bean.node;

import cn.sunline.assistant.annotation.Table;
import cn.sunline.assistant.bean.comm.CommBean;

/**
 * 管理系统
 * 
 * @author LYH
 *
 */
@Table(name="t_system")
public class App_system extends CommBean {
	@Override
	public String toString() {
		return "App_system [id=" + id + ", name=" + name + ", remark=" + remark + "]";
	}

}
