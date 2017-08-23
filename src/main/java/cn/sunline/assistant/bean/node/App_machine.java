package cn.sunline.assistant.bean.node;

import cn.sunline.assistant.bean.comm.CommBean;

/**
 * 应用所属机器
 * @author LYH
 *
 */
public class App_machine extends CommBean {
	private String mos;
	private String mhost;
	private String mip;
	private String mpc;
	private String mlc;
	private String mmem;
	private String mdisk;
	private String mpasswd;
	private String mvirtual;
	public String getMvirtual() {
		return mvirtual;
	}
	public void setMvirtual(String mvirtual) {
		this.mvirtual = mvirtual;
	}
	public String getMos() {
		return mos;
	}
	public void setMos(String mos) {
		this.mos = mos;
	}
	public String getMhost() {
		return mhost;
	}
	public void setMhost(String mhost) {
		this.mhost = mhost;
	}
	public String getMip() {
		return mip;
	}
	public void setMip(String mip) {
		this.mip = mip;
	}
	public String getMpc() {
		return mpc;
	}
	public void setMpc(String mpc) {
		this.mpc = mpc;
	}
	public String getMlc() {
		return mlc;
	}
	public void setMlc(String mlc) {
		this.mlc = mlc;
	}
	public String getMmem() {
		return mmem;
	}
	public void setMmem(String mmem) {
		this.mmem = mmem;
	}
	public String getMdisk() {
		return mdisk;
	}
	public void setMdisk(String mdisk) {
		this.mdisk = mdisk;
	}
	public String getMpasswd() {
		return mpasswd;
	}
	public void setMpasswd(String mpasswd) {
		this.mpasswd = mpasswd;
	}
	@Override
	public String toString() {
		return "App_machine [mos=" + mos + ", mhost=" + mhost + ", mip=" + mip + ", mpc=" + mpc + ", mlc=" + mlc
				+ ", mmem=" + mmem + ", mdisk=" + mdisk + ", mpasswd=" + mpasswd + ", id=" + id + ", name=" + name
				+ ", remark=" + remark + ", sysid=" + sysid + "]";
	}
	
}
