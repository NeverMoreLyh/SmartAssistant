package cn.sunline.assistant.bean.relation;

/**
 * 用户组与角色关联表
 * @author LYH
 *
 */
public class Relation_group_role {
	private String groupId;
	private String roleId;
	public Relation_group_role() {
		super();
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
}
