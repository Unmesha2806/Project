package com.java.lib;

import java.sql.Date;
import java.sql.Timestamp;


public class Transreturn {
	private String Username;
	private int BookId;
	private Date Fromdate;
	private Timestamp Todate;
	public Transreturn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transreturn(String username, int bookId, Date fromdate, Timestamp todate) {
		super();
		Username = username;
		BookId = bookId;
		Fromdate = fromdate;
		Todate = todate;
	}
	@Override
	public String toString() {
		return "Transreturn [Username=" + Username + ", BookId=" + BookId + ", Fromdate=" + Fromdate + ", Todate="
				+ Todate + "]";
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public Date getFromdate() {
		return Fromdate;
	}
	public void setFromdate(Date fromdate) {
		Fromdate = fromdate;
	}
	public Timestamp getTodate() {
		return Todate;
	}
	public void setTodate(Timestamp timestamp) {
		Todate = timestamp;
	}
	
	

}