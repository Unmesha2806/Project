package com.java.hms;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RoomMasterDaoImpl implements RoomMasterDAO{
	
	SessionFactory sf;
	Session session;
	
	
	@Override
	public List<RoomMaster> showRooms() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(RoomMaster.class);
		List<RoomMaster> roomList = criteria.list();
		return roomList;
	}

}
