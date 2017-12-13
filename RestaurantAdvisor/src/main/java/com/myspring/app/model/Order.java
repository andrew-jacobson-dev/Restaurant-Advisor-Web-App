package com.myspring.app.model;

public class Order {

	private static int ono;
	private String orderDate;
	private String custEmail;
	private String orderDineInFlag;
	private String orderDeliveryFlag;
	private String orderPickupFlag;
	private String orderPickupDate;
	private String orderDeliveryDate;
	private String orderDineInRecievedDate;

	public Order(String orderDate, String custEmail, String orderDineInFlag, String orderDeliveryFlag,
			String orderPickupFlag, String orderPickupDate, String orderDeliveryDate, String orderDineInRecievedDate) {
		super();
		this.orderDate = orderDate;
		this.custEmail = custEmail;
		this.orderDineInFlag = orderDineInFlag;
		this.orderDeliveryFlag = orderDeliveryFlag;
		this.orderPickupFlag = orderPickupFlag;
		this.orderPickupDate = orderPickupDate;
		this.orderDeliveryDate = orderDeliveryDate;
		this.orderDineInRecievedDate = orderDineInRecievedDate;
	}

	public Order(){
		super();
	}

	public static int getOno() {
		return ono;
	}

	public static void setOno(int ono) {
		Order.ono = ono;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getOrderDineInFlag() {
		return orderDineInFlag;
	}

	public void setOrderDineInFlag(String orderDineInFlag) {
		this.orderDineInFlag = orderDineInFlag;
	}

	public String getOrderDeliveryFlag() {
		return orderDeliveryFlag;
	}

	public void setOrderDeliveryFlag(String orderDeliveryFlag) {
		this.orderDeliveryFlag = orderDeliveryFlag;
	}

	public String getOrderPickupFlag() {
		return orderPickupFlag;
	}

	public void setOrderPickupFlag(String orderPickupFlag) {
		this.orderPickupFlag = orderPickupFlag;
	}

	public String getOrderPickupDate() {
		return orderPickupDate;
	}

	public void setOrderPickupDate(String orderPickupDate) {
		this.orderPickupDate = orderPickupDate;
	}

	public String getOrderDeliveryDate() {
		return orderDeliveryDate;
	}

	public void setOrderDeliveryDate(String orderDeliveryDate) {
		this.orderDeliveryDate = orderDeliveryDate;
	}

	public String getOrderDineInRecievedDate() {
		return orderDineInRecievedDate;
	}

	public void setOrderDineInRecievedDate(String orderDineInRecievedDate) {
		this.orderDineInRecievedDate = orderDineInRecievedDate;
	}

}