package ims.order.domain;

public class Cart {

	private long cartId;
	private long productId;
	private long productCount;
	private long productPrice;
	private String productCategory;
	private String productColor;
	private String productSize;
	private String productMaterial;
	private String productCollar;
	private String productPocket;
	private String productCreate;
	private String productModify;
	public long getCartId() {
		return cartId;
	}
	public String getProductCreate() {
		return productCreate;
	}
	public void setProductCreate(String productCreate) {
		this.productCreate = productCreate;
	}
	public String getProductModify() {
		return productModify;
	}
	public void setProductModify(String productModify) {
		this.productModify = productModify;
	}
	public void setCartId(long cartId) {
		this.cartId = cartId;
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
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", productId=" + productId + ", productCount=" + productCount
				+ ", productPrice=" + productPrice + ", productCategory=" + productCategory + ", productColor="
				+ productColor + ", productSize=" + productSize + ", productMaterial=" + productMaterial
				+ ", productCollar=" + productCollar + ", productPocket=" + productPocket + ", productCreate="
				+ productCreate + ", productModify=" + productModify + "]";
	}
	



}
