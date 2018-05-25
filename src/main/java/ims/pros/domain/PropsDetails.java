package ims.pros.domain;

public class PropsDetails {

	private long propsDetailsId;
	private String propsId;
	private String propsDetailsName;
	private String propsDetailsRemarks;
	public long getPropsDetailsId() {
		return propsDetailsId;
	}
	public void setPropsDetailsId(long propsDetailsId) {
		this.propsDetailsId = propsDetailsId;
	}
	public String getPropsId() {
		return propsId;
	}
	public void setPropsId(String propsId) {
		this.propsId = propsId;
	}
	public String getPropsDetailsName() {
		return propsDetailsName;
	}
	public void setPropsDetailsName(String propsDetailsName) {
		this.propsDetailsName = propsDetailsName;
	}
	public String getPropsDetailsRemarks() {
		return propsDetailsRemarks;
	}
	public void setPropsDetailsRemarks(String propsDetailsRemarks) {
		this.propsDetailsRemarks = propsDetailsRemarks;
	}
	@Override
	public String toString() {
		return "PropsDetails [propsDetailsId=" + propsDetailsId + ", propsId=" + propsId + ", propsDetailsName="
				+ propsDetailsName + ", propsDetailsRemarks=" + propsDetailsRemarks + "]";
	}
	
	
	
}
