package com.example.graceeorders.Services;

import com.example.graceeorders.Models.Customer;
import com.example.graceeorders.Repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "customerService")
public class CustomerServiceIMPL implements CustomerService
{

    @Autowired
    private CustomerRepo custrepo;

    @Override
    public List<Customer> findallcustomers()
    {
        List<Customer> rtnList = new ArrayList<>();

        custrepo.findAll()
                .iterator()
                .forEachRemaining(rtnList::add);
        return rtnList;
    }

    @Transactional
    @Override
    public Customer save(Customer customer)
    {
        return custrepo.save(customer);
    }

    @Override
    public Customer findCustomerById(long id)
    {
        return custrepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer" + id + "not found."));
    }

    @Override
    public List<Customer> findByNameLike(String thename)
    {
        return custrepo.findByCustnameContainingIgnoreCase(thename);

    }
}


///GET /customers/orders - Returns all customers with their orders
//GET /customers/customer/{id} - Returns the customer and their orders with the given customer id
//
//GET /customers/namelike/{likename} - Returns all customers and their orders with a customer name containing the given substring
//
//GET /customers/orders/count - Using a custom query, return a list of all customers with the number of orders they have placed.