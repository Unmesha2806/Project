package com.java.jsf;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RestaurantDAOImpl {

	SessionFactory sf;
	Session session;
	
	
	public List<Restaurant> showRestaurant(){
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Restaurant.class);
		return cr.list();
	}
	

}