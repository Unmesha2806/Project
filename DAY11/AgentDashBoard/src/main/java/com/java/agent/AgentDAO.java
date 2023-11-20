package com.java.agent;

import java.sql.SQLException;
import java.util.List;





public interface AgentDAO {
	List<Agent> showAgentDao() throws ClassNotFoundException, SQLException;
	String createAgentDao(Agent agent) throws ClassNotFoundException, SQLException;
	Agent searchAgentDao(int agentId) throws ClassNotFoundException, SQLException;
	String deleteAgentDao(int empno) throws ClassNotFoundException, SQLException;
	String updateAgentDao(Agent agent) throws ClassNotFoundException, SQLException;


}
