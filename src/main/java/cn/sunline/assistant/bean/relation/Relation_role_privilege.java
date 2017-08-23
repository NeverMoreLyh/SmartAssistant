package cn.sunline.assistant.bean.relation;

/**
 * 权限角色关联表
 * @author LYH
 *
 */
public class Relation_role_privilege {
	private String roleId;
	private String priviId;
	public Relation_role_privilege() {
		super();
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getPriviId() {
		return priviId;
	}
	public void setPriviId(String priviId) {
		this.priviId = priviId;
	}
	
}
