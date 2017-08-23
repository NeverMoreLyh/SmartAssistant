package cn.sunline.assistant.bean.node;

import cn.sunline.assistant.annotation.Table;

/**
 * 应用用户
 * @author LYH
 *
 */
@Table(name="t_user")
public class App_user {
	private String id;
	private String name;
	private String remark;
	public App_user() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "App_user [id=" + id + ", name=" + name + ", remark=" + remark + "]";
	}
}

