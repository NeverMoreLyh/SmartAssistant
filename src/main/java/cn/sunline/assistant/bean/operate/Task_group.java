package cn.sunline.assistant.bean.operate;

/**
 * 运维操作组
 * @author LYH
 *
 */
public class Task_group {
	private String taskGroupId;
	private String taskGroupName;
	public Task_group() {
		super();
	}
	public String getTaskGroupId() {
		return taskGroupId;
	}
	public void setTaskGroupId(String taskGroupId) {
		this.taskGroupId = taskGroupId;
	}
	public String getTaskGroupName() {
		return taskGroupName;
	}
	public void setTaskGroupName(String taskGroupName) {
		this.taskGroupName = taskGroupName;
	}
	
}
