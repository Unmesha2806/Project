package com.infinite.cms;


import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class RestaurantDAOImpl {
	
	SessionFactory sf;
	Session session;
	

	public List<Restaurant> showRestaurantDao(){
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Restaurant.class);
		List<Restaurant> resData = cr.list();
		return resData;
	}
	

}

