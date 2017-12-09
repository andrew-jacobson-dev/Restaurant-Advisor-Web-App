package com.myspring.app.model;

public class RestaurantsAndRatings {

	private Integer restid;
	private String rname;
	private Float avgrating;
	
	public RestaurantsAndRatings(Integer restid, String rname, Float avgrating) {
		super();
		this.restid = restid;
		this.rname = rname;
		this.avgrating = avgrating;
	}
	public Integer getRestid() {
		return restid;
	}
	public void setRestid(Integer restid) {
		this.restid = restid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public Float getAvgrating() {
		return avgrating;
	}
	public void setAvgrating(Float avgrating) {
		this.avgrating = avgrating;
	}
	public RestaurantsAndRatings() {
		super();
	}
	
}
