package ims.factory.domain;

public class ProducesOrderDetails {
	private long producesDetailsId;
	private long ProducesOrderId;
	private long productId;
	private long productCount;
	private long productPrice;
	private String productCategory;
	private String productColor;
	private String productSize;
	private String productMaterial;
	private String productCollar;
	private String productPocket;
	private String producesDetailsCreate;
	private String producesDetailsModify;
	private String producesDetailsRemarks;
	private String producesDetailsStatus;

	@Override
	public String toString() {
		return "ProducesOrderDetails [producesDetailsId=" + producesDetailsId + ", ProducesOrderId=" + ProducesOrderId
				+ ", productId=" + productId + ", productCount=" + productCount + ", productPrice=" + productPrice
				+ ", productCategory=" + productCategory + ", productColor=" + productColor + ", productSize="
				+ productSize + ", productMaterial=" + productMaterial + ", productCollar=" + productCollar
				+ ", productPocket=" + productPocket + ", producesDetailsCreate=" + producesDetailsCreate
				+ ", producesDetailsModify=" + producesDetailsModify + ", producesDetailsRemarks="
				+ producesDetailsRemarks + ", producesDetailsStatus=" + producesDetailsStatus + "]";
	}

	public long getProducesDetailsId() {
		return producesDetailsId;
	}

	public void setProducesDetailsId(long producesDetailsId) {
		this.producesDetailsId = producesDetailsId;
	}

	public long getProducesOrderId() {
		return ProducesOrderId;
	}

	public void setProducesOrderId(long producesOrderId) {
		ProducesOrderId = producesOrderId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getProductCount() {
		return productCount;
	}

	public void setProductCount(long productCount) {
		this.productCount = productCount;
	}

	public long getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	public String getProductMaterial() {
		return productMaterial;
	}

	public void setProductMaterial(String productMaterial) {
		this.productMaterial = productMaterial;
	}

	public String getProductCollar() {
		return productCollar;
	}

	public void setProductCollar(String productCollar) {
		this.productCollar = productCollar;
	}

	public String getProductPocket() {
		return productPocket;
	}

	public void setProductPocket(String productPocket) {
		this.productPocket = productPocket;
	}

	public String getProducesDetailsCreate() {
		return producesDetailsCreate;
	}

	public void setProducesDetailsCreate(String producesDetailsCreate) {
		this.producesDetailsCreate = producesDetailsCreate;
	}

	public String getProducesDetailsModify() {
		return producesDetailsModify;
	}

	public void setProducesDetailsModify(String producesDetailsModify) {
		this.producesDetailsModify = producesDetailsModify;
	}

	public String getProducesDetailsRemarks() {
		return producesDetailsRemarks;
	}

	public void setProducesDetailsRemarks(String producesDetailsRemarks) {
		this.producesDetailsRemarks = producesDetailsRemarks;
	}

	public String getProducesDetailsStatus() {
		return producesDetailsStatus;
	}

	public void setProducesDetailsStatus(String producesDetailsStatus) {
		this.producesDetailsStatus = producesDetailsStatus;
	}

}
