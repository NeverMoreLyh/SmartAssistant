package cn.sunline.assistant.bean.relation;

/**
 * 用户与用户组关联表
 * @author LYH
 *
 */
public class Relation_user_group {
	String userId;
	String groupId;
	public Relation_user_group() {
		super();
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
