package com.java.hms;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class DoctorMasterDaoImpl implements DoctorMasterDAO{
	
	SessionFactory sf;
	Session session;
	
	
	@Override
	public List<DoctorMaster> showDoctorDao() {
	//	Map<String, Object> sessionMap =
		//		FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(DoctorMaster.class);
		List<DoctorMaster> doctorList = criteria.list();
		System.out.println(doctorList);
	//	sessionMap.put("doctorList", doctorList);
	//	return "showDoectors.jsp?faces-redirect=true";
		return doctorList;
	}

}
