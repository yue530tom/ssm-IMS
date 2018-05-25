package ims.props.domain;

public class Props {

	private long propsId;
	private String propsName;
	private String propsDesc;
	private String propsRemarks;

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

	@Override
	public String toString() {
		return "Props [propsId=" + propsId + ", propsName=" + propsName + ", propsDesc=" + propsDesc + ", propsRemarks="
				+ propsRemarks + "]";
	}

}
