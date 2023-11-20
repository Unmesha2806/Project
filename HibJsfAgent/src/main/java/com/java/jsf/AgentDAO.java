package com.java.jsf;

import java.sql.SQLException;
import java.util.List;

public interface AgentDAO {


	List<Agent> showAgentDao();
	String searchAgentDao(int agentId);
	String addAgentDao(Agent agent);
	String deleteAgentDao(int agentId);
	String updateAgentDao(Agent agentNew);
}

