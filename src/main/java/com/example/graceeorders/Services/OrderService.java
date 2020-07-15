package com.example.graceeorders.Services;

import com.example.graceeorders.Models.Order;

public interface OrderService
{

    Order findById(long id);
}

////GET /orders/order/{id} - Returns the order and its customer with the given order number
////
