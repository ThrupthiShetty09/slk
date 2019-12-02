package com.slk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.slk.model.Agent;
import com.slk.util.DBUtil;
@RestController
public class AgentDAOimpl implements AgentDAO {
	
	Connection connection=DBUtil.getConnection();
//@Override
	
	/*private static List<Agent> agents;  
	{
		// TODO Auto-generated method stub
		
		agents =new ArrayList<>();
		try {
		String query="Select * from agent";
		PreparedStatement s=connection.prepareStatement(query);
		ResultSet rs=s.executeQuery();
		while(rs.next())
		{
			Agent agent1=new Agent();
			agent1.setAgent_id(rs.getInt(1));
			agent1.setName(rs.getString(2));
			agent1.setDOB(rs.getString(3));
			agent1.setPhone_no(rs.getInt(4));
			agent1.setUsername(rs.getString(5));
			agent1.setPassword(rs.getString(6));
			agent1.setBranch_id(rs.getInt(7));
			agents.add(agent1);
			//return agent;
		}
	}catch(Exception e) {
			e.printStackTrace();
		}
	
	
	}*/

public List<Agent> list() throws Exception {
	// TODO Auto-generated method stub
	List<Agent> agt = new ArrayList<>();
	try {
		String query="Select * from agent";
		PreparedStatement s=connection.prepareStatement(query);
		ResultSet rs=s.executeQuery();
		while(rs.next())
		{
			Agent agent1=new Agent();
			agent1.setAgent_id(rs.getInt(1));
			agent1.setName(rs.getString(2));
			agent1.setDOB(rs.getString(3));
			agent1.setPhone_no(rs.getInt(4));
			agent1.setUsername(rs.getString(5));
			agent1.setPassword(rs.getString(6));
			agent1.setBranch_id(rs.getInt(7));
			agt.add(agent1);
			//return agent;
		}
	}catch(Exception e) {
			e.printStackTrace();
		}
	return agt;
	
	
}
/*public List<Agent> getAgentById(int agent_id) {
	// TODO Auto-generated method stub


  try{
		
		
	  String sql="SELECT * FROM agent WHERE agent_id = ? ";	
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setInt(1, agent_id);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			Agent agent= new Agent();
			agent.setAgent_id(rs.getInt(1));
			agent.setName(rs.getString(2));
			agent.setDOB(rs.getString(3));
			agent.setPhone_no(rs.getInt(4));
			agent.setUsername(rs.getString(5));
			agent.setPassword(rs.getString(6));
			agent.setBranch_id(rs.getInt(7));
			}
		}catch(Exception e) {
	     e.printStackTrace();
  }
  return  agents;
     

}*/

@Override
public Agent getAgentById(int id) {
	// TODO Auto-generated method stub
	try{
		
		
		String sql="SELECT * FROM agent WHERE agent_id = ? ";	
				PreparedStatement pst = connection.prepareStatement(sql);
				pst.setInt(1, id);
				ResultSet rs=pst.executeQuery();
				while(rs.next()) {
					Agent agent= new Agent();
					agent.setAgent_id(rs.getInt(1));
					agent.setName(rs.getString(2));
					agent.setDOB(rs.getString(3));
					agent.setPhone_no(rs.getInt(4));
					agent.setUsername(rs.getString(5));
					agent.setPassword(rs.getString(6));
					agent.setBranch_id(rs.getInt(7));
					return agent;
					}
				}catch(Exception e) {
			     e.printStackTrace();
		  }
		return  null; 
		     
	
}



}
		
		
	
		
		






