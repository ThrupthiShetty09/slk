package com.slk.dao;

import java.util.ArrayList;
import java.util.List;

import com.slk.model.Agent;



public interface AgentDAO {
	
	/**
	 * Returns list of customers from dummy database.
	 * 
	 * @return list of customers
	 */
	

	public List<Agent> list() throws Exception;
	
	 Agent getAgentById(int id);



}
