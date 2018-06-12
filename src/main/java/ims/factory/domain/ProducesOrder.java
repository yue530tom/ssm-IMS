package ims.factory.domain;

public class ProducesOrder {
	private long producesOrderId;
	private long producesOrderNo;
	private long producesOrderFactoryId;
	private String producesOrderContacts;
	private String producesOrderPhone;
	private long producesOrderCount;
	private long producesOrderMoney;
	public long getProducesOrderMoney() {
		return producesOrderMoney;
	}

	public void setProducesOrderMoney(long producesOrderMoney) {
		this.producesOrderMoney = producesOrderMoney;
	}

	private String producesOrderDepost;
	private String producesOrderCreate;
	private String producesOrderModify;
	private String producesOrderRemarks;

	public long getProducesOrderId() {
		return producesOrderId;
	}

	public void setProducesOrderId(long producesOrderId) {
		this.producesOrderId = producesOrderId;
	}

	public long getProducesOrderNo() {
		return producesOrderNo;
	}

	public void setProducesOrderNo(long producesOrderNo) {
		this.producesOrderNo = producesOrderNo;
	}

	public long getProducesOrderFactoryId() {
		return producesOrderFactoryId;
	}

	public void setProducesOrderFactoryId(long producesOrderFactoryId) {
		this.producesOrderFactoryId = producesOrderFactoryId;
	}

	public long getProducesOrderCount() {
		return producesOrderCount;
	}

	public void setProducesOrderCount(long producesOrderCount) {
		this.producesOrderCount = producesOrderCount;
	}
	public String getProducesOrderContacts() {
		return producesOrderContacts;
	}

	public void setProducesOrderContacts(String producesOrderContacts) {
		this.producesOrderContacts = producesOrderContacts;
	}

	public String getProducesOrderPhone() {
		return producesOrderPhone;
	}

	public void setProducesOrderPhone(String producesOrderPhone) {
		this.producesOrderPhone = producesOrderPhone;
	}

	public String getProducesOrderDepost() {
		return producesOrderDepost;
	}

	public void setProducesOrderDepost(String producesOrderDepost) {
		this.producesOrderDepost = producesOrderDepost;
	}

	public String getProducesOrderCreate() {
		return producesOrderCreate;
	}

	public void setProducesOrderCreate(String producesOrderCreate) {
		this.producesOrderCreate = producesOrderCreate;
	}

	public String getProducesOrderModify() {
		return producesOrderModify;
	}

	public void setProducesOrderModify(String producesOrderModify) {
		this.producesOrderModify = producesOrderModify;
	}

	public String getProducesOrderRemarks() {
		return producesOrderRemarks;
	}

	public void setProducesOrderRemarks(String producesOrderRemarks) {
		this.producesOrderRemarks = producesOrderRemarks;
	}

	@Override
	public String toString() {
		return "ProducesOrder [producesOrderId=" + producesOrderId + ", producesOrderNo=" + producesOrderNo
				+ ", producesOrderFactoryId=" + producesOrderFactoryId + ", producesOrderContacts="
				+ producesOrderContacts + ", producesOrderPhone=" + producesOrderPhone + ", producesOrderCount="
				+ producesOrderCount + ", producesOrderMoney=" + producesOrderMoney + ", producesOrderDepost="
				+ producesOrderDepost + ", producesOrderCreate=" + producesOrderCreate + ", producesOrderModify="
				+ producesOrderModify + ", producesOrderRemarks=" + producesOrderRemarks + "]";
	}

}
