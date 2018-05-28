package ims.props.domain;

public class PropsDetails {

	private long propsDetailsId;
	private long propsId;
	private String propsDetailsName;
	private String propsDetailsDesc;
	private String propsDetailsRemarks;
	private String propsDetailsStatus;

	public long getPropsDetailsId() {
		return propsDetailsId;
	}

	public void setPropsDetailsId(long propsDetailsId) {
		this.propsDetailsId = propsDetailsId;
	}

	public long getPropsId() {
		return propsId;
	}

	public void setPropsId(long propsId) {
		this.propsId = propsId;
	}

	public String getPropsDetailsName() {
		return propsDetailsName;
	}

	public void setPropsDetailsName(String propsDetailsName) {
		this.propsDetailsName = propsDetailsName;
	}

	public String getPropsDetailsDesc() {
		return propsDetailsDesc;
	}

	public void setPropsDetailsDesc(String propsDetailsDesc) {
		this.propsDetailsDesc = propsDetailsDesc;
	}

	public String getPropsDetailsRemarks() {
		return propsDetailsRemarks;
	}

	public void setPropsDetailsRemarks(String propsDetailsRemarks) {
		this.propsDetailsRemarks = propsDetailsRemarks;
	}

	public String getPropsDetailsStatus() {
		return propsDetailsStatus;
	}

	public void setPropsDetailsStatus(String propsDetailsStatus) {
		this.propsDetailsStatus = propsDetailsStatus;
	}

	@Override
	public String toString() {
		return "PropsDetails [propsDetailsId=" + propsDetailsId + ", propsId=" + propsId + ", propsDetailsName="
				+ propsDetailsName + ", propsDetailsDesc=" + propsDetailsDesc + ", propsDetailsRemarks="
				+ propsDetailsRemarks + ", propsDetailsStatus=" + propsDetailsStatus + "]";
	}

}
