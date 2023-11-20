package com.java.infinite;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class AgentDaoImpl implements AgentDAO{

	SessionFactory sf;
	Session session;
	
	@Override
	public List<Agent> showAgentDao() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Agent.class);
		List<Agent> agentList = criteria.list();
		return agentList;
	}

	@Override
	public Agent searchAgentDao(int agentid) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Agent.class);
		criteria.add(Restrictions.eq("AgentID", agentid));
		Agent agent = (Agent)criteria.uniqueResult();
		return agent;
	}

	@Override
	public String addAgentDao(Agent agent) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(agent);
		transaction.commit();
		return "Data Added to Agent Table";
	}

	@Override
	public String updateAgentDao(Agent agent) {
		Agent agentFound = searchAgentDao(agent.getAgentId());
		if(agentFound!=null) {
			sf = SessionHelper.getConnection();
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(agent);
			transaction.commit();
			return "Data Added to Agent Table";
		}else {
			return "No Agent Found";
		}
		
	}

	@Override
	public String deleteAgentDao(int agentid) {
		Agent agentFound = searchAgentDao(agentid);
		if(agentFound!=null) {
			sf = SessionHelper.getConnection();
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(agentFound);
			transaction.commit();
			return "Data Deleated From Agent Table";
		}else {
			return "No Agent Found";
		}
	}

}
