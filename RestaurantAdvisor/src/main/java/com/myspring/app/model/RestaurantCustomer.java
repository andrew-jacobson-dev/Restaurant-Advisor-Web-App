package com.myspring.app.model;

import org.springframework.stereotype.Component;

@Component
public class RestaurantCustomer {
	
	private String email;
	private String fname;
	private String minit;
	private String lname;
	private String phone;
	private String password;
	private String streetno;
	private String streetname;
	private String city;
	private String state;
	private String zip;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMinit() {
		return minit;
	}

	public void setMinit(String minit) {
		this.minit = minit;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	@Override
	public String toString() {
		return "RestaurantCustomer [email=" + email + ", fname=" + fname + ", minit=" + minit + ", lname=" + lname + ", phone=" + phone + ", password=" + password + ", streetno="	+ streetno + ", streetname=" + streetname + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
	public RestaurantCustomer(String Email, String Fname, String Minit, String Lname, String Phone, String Password, String Streetno, String Streetname, String City,
			String State, String Zip) {
		super();
		email = Email;
		fname = Fname;
		minit = Minit;
		lname = Lname;
		phone = Phone;
		password = Password;
		streetno = Streetno;
		streetname = Streetname;
		city = City;
		state = State;
		zip = Zip;
	}

	public RestaurantCustomer() {
		super();
		email = "";
		fname = "";
		minit = "";
		lname = "";
		phone = "";
		password = "";
		streetno = "";
		streetname = "";
		city = "";
		state = "";
		zip = "";
	}	
	

}
