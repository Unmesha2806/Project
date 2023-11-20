package com.infinite.cms;

import java.util.Date;

public class Customer {

	
	private int customerId;
	private String Name;
	private String userName;
	private String password;
	private String email;
	private int phoneNo;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Customer(int customerId, String name, String userName, String password, String email, int phoneNo) {
		super();
		this.customerId = customerId;
		Name = name;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", Name=" + Name + ", userName=" + userName + ", password="
				+ password + ", email=" + email + ", phoneNo=" + phoneNo + "]";
	}
	
	
}
	
	
	
	
