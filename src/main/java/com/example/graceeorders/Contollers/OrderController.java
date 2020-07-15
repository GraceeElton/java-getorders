package com.example.graceeorders.Contollers;

import com.example.graceeorders.Models.Order;
import com.example.graceeorders.Repos.OrderRepos;
import com.example.graceeorders.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agents")
public class OrderController
{

    @Autowired
    private OrderService orderService;

    //http://localhost:2019/orders/order/7

    @GetMapping(value = "/order/{id}", produces = {"application/json"})
    public ResponseEntity<?> listOrdersById(@PathVariable long id)
    {
        Order o = orderService.findById(id);
        return new ResponseEntity<>(o, HttpStatus.OK);
    }
}
