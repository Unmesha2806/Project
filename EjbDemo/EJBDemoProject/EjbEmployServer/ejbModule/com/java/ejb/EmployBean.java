package com.java.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class EmployBean
 */
@Stateless
@Remote(EmployBeanRemote.class)
public class EmployBean implements EmployBeanRemote {
	
	@PersistenceContext(unitName = "EmpMgmtPU")
	private EntityManager entityManager;

    /**
     * Default constructor. 
     */
    public EmployBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Employ> showEmploy() {
		System.out.println("Entity Manager is " +entityManager);
		Query query = entityManager.createQuery("SELECT e from Employ e");
		return (List<Employ>) query.getResultList();
		
	}

}
