package com.java.infinite;

import java.util.List;

public interface AgentDAO {
	List<Agent> showAgentDao();
	Agent searchAgentDao(int agentid);
	String addAgentDao(Agent agent);
	String updateAgentDao(Agent agent);
	String deleteAgentDao(int agentid);
}
