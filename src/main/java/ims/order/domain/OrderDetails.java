package ims.order.domain;

public class OrderDetails {

	/**
	 * 订单明细：包含主体订单所包含的产品
	 */
	private long orderDetailsID;
	private long orderDetailsOrderId;
	private String orderDetailsProductId;
	private String orderDetailsProductNum;
	private String orderDetailsProductPrice;
	private String orderDetailsProductMaterial;
	private String orderDetailsProductColor;
	private String orderDetailsProductSize;
	private String orderDetailsProductCollar;
	private String orderDetailsCreate;
	private String orderDetailsModify;
	private String orderDetailsRemarks;

	public long getOrderDetailsID() {
		return orderDetailsID;
	}

	public void setOrderDetailsID(long orderDetailsID) {
		this.orderDetailsID = orderDetailsID;
	}

	public long getOrderDetailsOrderId() {
		return orderDetailsOrderId;
	}

	public void setOrderDetailsOrderId(long orderDetailsOrderId) {
		this.orderDetailsOrderId = orderDetailsOrderId;
	}

	public String getOrderDetailsProductId() {
		return orderDetailsProductId;
	}

	public void setOrderDetailsProductId(String orderDetailsProductId) {
		this.orderDetailsProductId = orderDetailsProductId;
	}

	public String getOrderDetailsProductNum() {
		return orderDetailsProductNum;
	}

	public void setOrderDetailsProductNum(String orderDetailsProductNum) {
		this.orderDetailsProductNum = orderDetailsProductNum;
	}

	public String getOrderDetailsProductPrice() {
		return orderDetailsProductPrice;
	}

	public void setOrderDetailsProductPrice(String orderDetailsProductPrice) {
		this.orderDetailsProductPrice = orderDetailsProductPrice;
	}

	public String getOrderDetailsProductMaterial() {
		return orderDetailsProductMaterial;
	}

	public void setOrderDetailsProductMaterial(String orderDetailsProductMaterial) {
		this.orderDetailsProductMaterial = orderDetailsProductMaterial;
	}

	public String getOrderDetailsProductColor() {
		return orderDetailsProductColor;
	}

	public void setOrderDetailsProductColor(String orderDetailsProductColor) {
		this.orderDetailsProductColor = orderDetailsProductColor;
	}

	public String getOrderDetailsProductSize() {
		return orderDetailsProductSize;
	}

	public void setOrderDetailsProductSize(String orderDetailsProductSize) {
		this.orderDetailsProductSize = orderDetailsProductSize;
	}

	public String getOrderDetailsProductCollar() {
		return orderDetailsProductCollar;
	}

	public void setOrderDetailsProductCollar(String orderDetailsProductCollar) {
		this.orderDetailsProductCollar = orderDetailsProductCollar;
	}

	public String getOrderDetailsCreate() {
		return orderDetailsCreate;
	}

	public void setOrderDetailsCreate(String orderDetailsCreate) {
		this.orderDetailsCreate = orderDetailsCreate;
	}

	public String getOrderDetailsModify() {
		return orderDetailsModify;
	}

	public void setOrderDetailsModify(String orderDetailsModify) {
		this.orderDetailsModify = orderDetailsModify;
	}

	public String getOrderDetailsRemarks() {
		return orderDetailsRemarks;
	}

	public void setOrderDetailsRemarks(String orderDetailsRemarks) {
		this.orderDetailsRemarks = orderDetailsRemarks;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderDetailsID=" + orderDetailsID + ", orderDetailsOrderId=" + orderDetailsOrderId
				+ ", orderDetailsProductId=" + orderDetailsProductId + ", orderDetailsProductNum="
				+ orderDetailsProductNum + ", orderDetailsProductPrice=" + orderDetailsProductPrice
				+ ", orderDetailsProductMaterial=" + orderDetailsProductMaterial + ", orderDetailsProductColor="
				+ orderDetailsProductColor + ", orderDetailsProductSize=" + orderDetailsProductSize
				+ ", orderDetailsProductCollar=" + orderDetailsProductCollar + ", orderDetailsCreate="
				+ orderDetailsCreate + ", orderDetailsModify=" + orderDetailsModify + ", orderDetailsRemarks="
				+ orderDetailsRemarks + "]";
	}

}
