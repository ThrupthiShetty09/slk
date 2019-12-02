package com.slk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.slk.dao.AgentDAO;
import com.slk.dao.AgentDAOimpl;
import com.slk.model.Agent;

@RestController
@Repository
public class AgentRestController {
	@Autowired
	private AgentDAO agentDAO;
	private Agent agent;

	@GetMapping("/Agent")
	public List list() throws Exception {
		return agentDAO.list();
	}

	@GetMapping("/agent/{agent_id}")
	public ResponseEntity getAgentById(@PathVariable("agent_id") Integer agent_id) {

		Agent agent = agentDAO.getAgentById(agent_id);
		if (agent == null) {
			return new ResponseEntity("No Agent found for ID " + agent_id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(agent, HttpStatus.OK);
	}

}
