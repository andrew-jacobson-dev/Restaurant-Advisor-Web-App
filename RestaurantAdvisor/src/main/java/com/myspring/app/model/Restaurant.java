package com.myspring.app.model;

import org.springframework.stereotype.Component;

@Component
public class Restaurant {

	private String restid;
	private String rname;
	private String phone;
	private String email;
	private String hours;
	private String diningtype;
	private String streetno;
	private String streetname;
	private String city;
	private String state;
	private String zip;
	private String pricerange;
	private String deliveryflag;
	private String outdoorseatingflag;
	
	public String getRestid() {
		return restid;
	}
	public void setRestid(String restid) {
		this.restid = restid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public String getDiningtype() {
		return diningtype;
	}
	public void setDiningtype(String diningtype) {
		this.diningtype = diningtype;
	}
	public String getStreetno() {
		return streetno;
	}
	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPricerange() {
		return pricerange;
	}
	public void setPricerange(String pricerange) {
		this.pricerange = pricerange;
	}
	public String getDeliveryflag() {
		return deliveryflag;
	}
	public void setDeliveryflag(String deliveryflag) {
		this.deliveryflag = deliveryflag;
	}
	public String getOutdoorseatingflag() {
		return outdoorseatingflag;
	}
	public void setOutdoorseatingflag(String outdoorseatingflag) {
		this.outdoorseatingflag = outdoorseatingflag;
	}
	public Restaurant(String restid, String rname, String phone, String email, String hours, String diningtype,
			String streetno, String streetname, String city, String state, String zip, String pricerange,
			String deliveryflag, String outdoorseatingflag) {
		super();
		this.restid = restid;
		this.rname = rname;
		this.phone = phone;
		this.email = email;
		this.hours = hours;
		this.diningtype = diningtype;
		this.streetno = streetno;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.pricerange = pricerange;
		this.deliveryflag = deliveryflag;
		this.outdoorseatingflag = outdoorseatingflag;
	}
	public Restaurant() {
		super();
	}
	
}
