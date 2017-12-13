package com.myspring.app.model;

public class ODetails {

	private Integer ono;
	private String foodname;
	private String restid;
	private Integer qty;
	public Integer getOno() {
		return ono;
	}
	public void setOno(Integer ono) {
		this.ono = ono;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public String getRestid() {
		return restid;
	}
	public void setRestid(String restid) {
		this.restid = restid;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public ODetails(Integer ono, String foodname, String restid, Integer qty) {
		super();
		this.ono = ono;
		this.foodname = foodname;
		this.restid = restid;
		this.qty = qty;
	}
	public ODetails() {
		super();
	}
	
}
