package ims.props.domain;

public class Props {

	private long propsId;
	private String propsName;
	private String propsDesc;
	private String propsRemarks;
	private String propsCreate;
	private String propsModify;
	public String getPropsCreate() {
		return propsCreate;
	}

	public void setPropsCreate(String propsCreate) {
		this.propsCreate = propsCreate;
	}

	public String getPropsModify() {
		return propsModify;
	}

	public void setPropsModify(String propsModify) {
		this.propsModify = propsModify;
	}

	private String propsStatus;

	public long getPropsId() {
		return propsId;
	}

	public void setPropsId(long propsId) {
		this.propsId = propsId;
	}

	public String getPropsName() {
		return propsName;
	}

	public void setPropsName(String propsName) {
		this.propsName = propsName;
	}

	public String getPropsDesc() {
		return propsDesc;
	}

	public void setPropsDesc(String propsDesc) {
		this.propsDesc = propsDesc;
	}

	public String getPropsRemarks() {
		return propsRemarks;
	}

	public void setPropsRemarks(String propsRemarks) {
		this.propsRemarks = propsRemarks;
	}

	public String getPropsStatus() {
		return propsStatus;
	}

	public void setPropsStatus(String propsStatus) {
		this.propsStatus = propsStatus;
	}

	@Override
	public String toString() {
		return "Props [propsId=" + propsId + ", propsName=" + propsName + ", propsDesc=" + propsDesc + ", propsRemarks="
				+ propsRemarks + ", prppsCreate=" + propsCreate + ", propsModify=" + propsModify + ", propsStatus="
				+ propsStatus + "]";
	}



}
