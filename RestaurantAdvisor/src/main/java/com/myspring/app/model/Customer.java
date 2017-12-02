package com.myspring.app.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private String FirstName;
	private String LastName;
	private String Email;
	private String HouseNo;
	private String Street;
	private String City;
	private String State;
	private String Zip;
	private String Phone;
	private String Password;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getHouseNo() {
		return HouseNo;
	}
	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	@Override
	public String toString() {
		return "Customer [FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + ", HouseNo="
				+ HouseNo + ", Street=" + Street + ", City=" + City + ", State=" + State + ", Zip=" + Zip + ", Phone="
				+ Phone + ", Password=" + Password + "]";
	}
	
	public Customer(String firstName, String lastName, String email, String houseNo, String street, String city,
			String state, String zip, String phone, String password) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		HouseNo = houseNo;
		Street = street;
		City = city;
		State = state;
		Zip = zip;
		Phone = phone;
		Password = password;
	}

	public Customer() {
		super();
		FirstName = "";
		LastName = "";
		Email = "";
		HouseNo = "";
		Street = "";
		City = "";
		State = "";
		Zip = "";
		Phone = "";
		Password = "";
	}	
	

}
