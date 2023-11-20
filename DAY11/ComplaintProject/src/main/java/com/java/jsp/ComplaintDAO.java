package com.java.jsp;

import java.sql.SQLException;
import java.util.List;

public interface ComplaintDAO {

	List<Complaint> showComplaintDAO() throws ClassNotFoundException, SQLException;
	Complaint searchComplaintDAO(String complaintid) throws ClassNotFoundException,SQLException;
	String addComplaintDAO(Complaint complaint) throws ClassNotFoundException,SQLException;
	
}
