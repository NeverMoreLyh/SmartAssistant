package cn.sunline.assistant.bean.comm;

import cn.sunline.assistant.bean.CommField;

public class CommBean extends CommField {
	public String id;
	public String name;
	public String remark;
	public String sysid;
	
	public String getSysid() {
		return sysid;
	}
	public void setSysid(String sysid) {
		this.sysid = sysid;
	}
	public CommBean() {
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
		return "CommBean [id=" + id + ", name=" + name + ", remark=" + remark + ", sysid=" + sysid + "]";
	}
}
