package com.java.agent;

import java.sql.SQLException;
import java.util.List;

import com.java.agent.AgentDao;
import com.java.agent.AgentDaoImpl;


public class AgentShowMain {
	
	public static void main(String[] args)  {
		AgentDao dao = new AgentDaoImpl();
		
		List<Agent> agentList;
		try {
			agentList = dao.showAgentDao();
			for(Agent agent : agentList) {
			System.out.println(agentList.size());
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}	

}
