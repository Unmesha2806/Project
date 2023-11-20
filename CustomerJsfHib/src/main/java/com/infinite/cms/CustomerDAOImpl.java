package com.infinite.cms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CustomerDAOImpl {
	
	SessionFactory sf;
	Session session;
	

	public List<Customer> showCustomerDao(){
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Customer.class);
		return cr.list();

	}
}
