package com.example.graceeorders.Contollers;

import com.example.graceeorders.Models.Customer;
import com.example.graceeorders.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController
{
    @Autowired
    private CustomerService customerService;

    //http://localhost:2019/customers/orders
    @GetMapping(value = "/orders", produces = {"application/json"})
    public ResponseEntity<?> listAllCustomers()
    {
        List<Customer> mycustomers = customerService.findallcustomers();
        return new ResponseEntity<>(mycustomers, HttpStatus.OK);
    }

  //  http://localhost:2019/customers/customer/7
    @GetMapping(value = "/customer/{id}", produces = {"application/json"})
    public ResponseEntity<?> findbyid(@PathVariable long id)
    {
        Customer c = customerService.findCustomerById(id);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }


    // http://localhost:2019/customers/namelike/mes
    @GetMapping(value = "/namelike/{thename}", produces = {"application/json"})
    public ResponseEntity<?> findByLikeName(@PathVariable String thename)
    {
        List<Customer> mycustomers = customerService.findByNameLike(thename);
        return new ResponseEntity<>(mycustomers, HttpStatus.OK);

    }


}
