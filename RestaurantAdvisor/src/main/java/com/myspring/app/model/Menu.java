package com.myspring.app.model;

public class Menu {

	private String restid;
	private String foodname;
	private String fcatname;
	private String rname;
	private Integer price;
	public String getRestid() {
		return restid;
	}
	public void setRestid(String restid) {
		this.restid = restid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public String getFcatname() {
		return fcatname;
	}
	public void setFcatname(String fcatname) {
		this.fcatname = fcatname;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Menu(String restid, String foodname, String fcatname, String rname, Integer price) {
		super();
		this.restid = restid;
		this.foodname = foodname;
		this.fcatname = fcatname;
		this.rname = rname;
		this.price = price;
	}
	public Menu() {
		super();
	}

}
