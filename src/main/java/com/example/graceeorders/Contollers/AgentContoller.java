package com.example.graceeorders.Contollers;

import com.example.graceeorders.Models.Agent;
import com.example.graceeorders.Services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agents")
public class AgentContoller
{

    @Autowired
    private AgentService agentService;

    //http://localhost:2019/agents/agent/9
    @GetMapping(value = "/agent/{id}", produces = {"application/json"})
    public ResponseEntity<?> listOrderById(@PathVariable long id)
    {
        Agent o = agentService.findById(id);
        return new ResponseEntity<>(o, HttpStatus.OK);
    }
}
