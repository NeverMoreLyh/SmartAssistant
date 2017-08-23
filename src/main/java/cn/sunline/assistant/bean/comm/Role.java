package cn.sunline.assistant.bean.comm;

/**
 * 角色表
 * @author LYH
 *
 */
public class Role {
	String roleId;
	String roleName;
	String remark;
	
	public Role() {
		super();
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
