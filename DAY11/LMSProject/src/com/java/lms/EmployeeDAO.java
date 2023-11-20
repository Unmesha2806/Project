package com.java.lms;

import java.sql.SQLException;
import java.util.List;
import java.util.Stack;

public interface EmployeeDAO {

	List<Employee> showEmployeeDao() throws ClassNotFoundException, SQLException;
	Employee searchEmployeeDao(int empId) throws ClassNotFoundException, SQLException;
	
}