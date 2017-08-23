package cn.sunline.assistant.bean.comm;

/**
 * 系统参数配置表
 * @author LYH
 *
 */
public class Sys_conf {
	private String parmId;
	private String parmKey;
	private String parmValue;
	private String desc;
	public Sys_conf() {
		super();
	}
	public String getParmId() {
		return parmId;
	}
	public void setParmId(String parmId) {
		this.parmId = parmId;
	}
	public String getParmKey() {
		return parmKey;
	}
	public void setParmKey(String parmKey) {
		this.parmKey = parmKey;
	}
	public String getParmValue() {
		return parmValue;
	}
	public void setParmValue(String parmValue) {
		this.parmValue = parmValue;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Sys_conf [parmId=" + parmId + ", parmKey=" + parmKey + ", parmValue=" + parmValue + ", desc=" + desc
				+ "]";
	}
}
