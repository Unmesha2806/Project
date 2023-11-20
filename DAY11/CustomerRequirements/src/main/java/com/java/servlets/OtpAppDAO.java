package com.java.servlets;

import java.sql.SQLException;

public interface OtpAppDAO {
	String createAccountDao(Customer customer) throws ClassNotFoundException, SQLException;
	Customer searchCustomerDao(String username) throws ClassNotFoundException, SQLException;
	String validateOtpDao(String username,int otp) throws ClassNotFoundException, SQLException;
	String loginDAO(String username, String password);
	String loginDAO(String username, String password);
}
