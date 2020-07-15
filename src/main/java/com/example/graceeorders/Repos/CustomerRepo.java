package com.example.graceeorders.Repos;

import com.example.graceeorders.Models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepo extends CrudRepository<Customer, Long>
{
    List<Customer> findByCustnameContainingIgnoreCase(String thename);
}
