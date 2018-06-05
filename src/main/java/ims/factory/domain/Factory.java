package ims.factory.domain;

import java.util.Date;

public class Factory {
	private long factoryId;
	private String factoryName;
	private String factoryContacts;
	private String factoryPhone;
	private String factoryTelephone;
	private String factoryAddress;
	private String factoryScale;
	private String factoryRemarks;
	private String factoryCreate;
	private String factoryModify;
	private String factoryStatus;
	
	public long getFactoryId() {
		return factoryId;
	}
	public void setFactoryId(long factoryId) {
		this.factoryId = factoryId;
	}
	
	public String getFactoryName() {
		return factoryName;
	}
	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}
	public String getFactoryContacts() {
		return factoryContacts;
	}
	public void setFactoryContacts(String factoryContacts) {
		this.factoryContacts = factoryContacts;
	}
	public String getFactoryPhone() {
		return factoryPhone;
	}
	public void setFactoryPhone(String factoryPhone) {
		this.factoryPhone = factoryPhone;
	}
	public String getFactoryTelephone() {
		return factoryTelephone;
	}
	public void setFactoryTelephone(String factoryTelephone) {
		this.factoryTelephone = factoryTelephone;
	}
	public String getFactoryAddress() {
		return factoryAddress;
	}
	public void setFactoryAddress(String factoryAddress) {
		this.factoryAddress = factoryAddress;
	}
	public String getFactoryScale() {
		return factoryScale;
	}
	public void setFactoryScale(String factoryScale) {
		this.factoryScale = factoryScale;
	}
	public String getFactoryRemarks() {
		return factoryRemarks;
	}
	public void setFactoryRemarks(String factoryRemarks) {
		this.factoryRemarks = factoryRemarks;
	}
	
	
	public String getFactoryStatus() {
		return factoryStatus;
	}
	public void setFactoryStatus(String factoryStatus) {
		this.factoryStatus = factoryStatus;
	}
	public String getFactoryCreate() {
		return factoryCreate;
	}
	public void setFactoryCreate(String factoryCreate) {
		this.factoryCreate = factoryCreate;
	}
	public String getFactoryModify() {
		return factoryModify;
	}
	public void setFactoryModify(String factoryModify) {
		this.factoryModify = factoryModify;
	}
	@Override
	public String toString() {
		return "Factory [factoryId=" + factoryId + ", factoryName=" + factoryName + ", factoryContacts="
				+ factoryContacts + ", factoryPhone=" + factoryPhone + ", factoryTelephone=" + factoryTelephone
				+ ", factoryAddress=" + factoryAddress + ", factoryScale=" + factoryScale + ", factoryRemarks="
				+ factoryRemarks + ", factoryCreate=" + factoryCreate + ", factoryModify=" + factoryModify
				+ ", factoryStatus=" + factoryStatus + "]";
	}


	

}
