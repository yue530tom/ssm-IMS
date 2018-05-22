package ims.factory.domain;

public class Factory {
	private long factory_id;
	private String factory_contacts;
	private String factory_phone;
	private String factory_telephone;
	private String factory_address;
	private String factory_scale;
	private String factory_remarks;

	public long getFactory_id() {
		return factory_id;
	}

	public void setFactory_id(long factory_id) {
		this.factory_id = factory_id;
	}

	public String getFactory_contacts() {
		return factory_contacts;
	}

	public void setFactory_contacts(String factory_contacts) {
		this.factory_contacts = factory_contacts;
	}

	public String getFactory_phone() {
		return factory_phone;
	}

	public void setFactory_phone(String factory_phone) {
		this.factory_phone = factory_phone;
	}

	public String getFactory_telephone() {
		return factory_telephone;
	}

	public void setFactory_telephone(String factory_telephone) {
		this.factory_telephone = factory_telephone;
	}

	public String getFactory_address() {
		return factory_address;
	}

	public void setFactory_address(String factory_address) {
		this.factory_address = factory_address;
	}

	public String getFactory_scale() {
		return factory_scale;
	}

	public void setFactory_scale(String factory_scale) {
		this.factory_scale = factory_scale;
	}

	public String getFactory_remarks() {
		return factory_remarks;
	}

	public void setFactory_remarks(String factory_remarks) {
		this.factory_remarks = factory_remarks;
	}

	@Override
	public String toString() {
		return "Factory [factory_id=" + factory_id + ", factory_contacts=" + factory_contacts + ", factory_phone="
				+ factory_phone + ", factory_telephone=" + factory_telephone + ", factory_address=" + factory_address
				+ ", factory_scale=" + factory_scale + ", factory_remarks=" + factory_remarks + "]";
	}

}
