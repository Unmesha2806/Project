package com.java.beans;

public class NameBean {
	private String firstName;
	private String lastName;
	public NameBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getfullName() {
		return firstName + " "+lastName;
	}

}