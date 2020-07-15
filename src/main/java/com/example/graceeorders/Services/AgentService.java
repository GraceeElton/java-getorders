package com.example.graceeorders.Services;

import com.example.graceeorders.Models.Agent;

public interface AgentService
{

    Agent findById(long id);
}



//GET /agents/agent/{id} - Returns the agent and their customers with the given agent id
//

