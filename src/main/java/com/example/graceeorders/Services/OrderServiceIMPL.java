package com.example.graceeorders.Services;

import com.example.graceeorders.Models.Order;
import com.example.graceeorders.Repos.CustomerRepo;
import com.example.graceeorders.Repos.OrderRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "orderService")
public class OrderServiceIMPL implements OrderService
{
    @Autowired
    private OrderRepos orderRepos;

    @Override
    public Order findById(long id)
    {
        return orderRepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer" + id + "not found."));
    }
}


//GET /orders/order/{id} - Returns the order and its customer with the given order number
//
