package cn.sunline.assistant.bean.comm;

public class CommSequence {
	String seqId;
	String seqName;
	Integer min;
	Integer max;
	Integer now;
	Integer step;
	Integer version;
	String isloop;
	public CommSequence() {
	}
	public String getSeqId() {
		return seqId;
	}
	public void setSeqId(String seqId) {
		this.seqId = seqId;
	}
	public String getSeqName() {
		return seqName;
	}
	public void setSeqName(String seqName) {
		this.seqName = seqName;
	}
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
	public Integer getNow() {
		return now;
	}
	public void setNow(Integer now) {
		this.now = now;
	}
	public Integer getStep() {
		return step;
	}
	public void setStep(Integer step) {
		this.step = step;
	}
	public String getIsloop() {
		return isloop;
	}
	public void setIsloop(String isloop) {
		this.isloop = isloop;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "CommSequence [seqId=" + seqId + ", seqName=" + seqName + ", min=" + min + ", max=" + max + ", now="
				+ now + ", step=" + step + ", version=" + version + ", isloop=" + isloop + "]";
	}
}
