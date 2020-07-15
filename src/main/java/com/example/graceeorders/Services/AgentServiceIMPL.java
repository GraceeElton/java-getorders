package com.example.graceeorders.Services;

import com.example.graceeorders.Models.Agent;
import com.example.graceeorders.Repos.AgentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "agentService")
public class AgentServiceIMPL implements AgentService
{
    @Autowired
    private AgentRepo agentRepo;

    @Override
    public Agent findById(long id)
    {
        return agentRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer" + id + "not found."));
    }
}

//GET /agents/agent/{id} - Returns the agent and their customers with the given agent id

