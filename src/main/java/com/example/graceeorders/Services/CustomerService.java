package com.example.graceeorders.Services;

import com.example.graceeorders.Models.Customer;

import java.util.List;

public interface CustomerService
{

   List<Customer> findallcustomers();

    Customer findCustomerById(long id);

    List<Customer> findByNameLike(String thename);

    Customer save(Customer customer);

}


///GET /customers/orders - Returns all customers with their orders
//GET /customers/customer/{id} - Returns the customer and their orders with the given customer id
//
//GET /customers/namelike/{likename} - Returns all customers and their orders with a customer name containing the given substring
//

//GET /customers/orders/count - Using a custom query, return a list of all customers with the number of orders they have placed.