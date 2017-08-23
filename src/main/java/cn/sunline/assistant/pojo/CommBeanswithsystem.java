package cn.sunline.assistant.pojo;

public class CommBeanswithsystem {
	public String id;
	public String name;
	public String remark;
	public String sysid;
	public String sysname;

	public CommBeanswithsystem() {
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
	public String getSysname() {
		return sysname;
	}
	public void setSysname(String sysname) {
		this.sysname = sysname;
	}
	
	public String getSysid() {
		return sysid;
	}
	public void setSysid(String sysid) {
		this.sysid = sysid;
	}
	@Override
	public String toString() {
		return "CommBeanswithsystem [id=" + id + ", name=" + name + ", remark=" + remark + ", sysid=" + sysid
				+ ", sysname=" + sysname + "]";
	}

	
}
