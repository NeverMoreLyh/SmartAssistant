package cn.sunline.assistant.bean.comm;

/**
 * 用户组定义
 * @author LYH
 *
 */
public class Group {
	private String groupId;
	private String groupName;
	private String remark;
	public Group() {
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", groupName=" + groupName + ", remark=" + remark + "]";
	}
}
