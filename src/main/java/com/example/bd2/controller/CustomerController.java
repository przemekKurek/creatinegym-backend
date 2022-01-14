package com.example.bd2.controller;

import com.example.bd2.model.Customer;
import com.example.bd2.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @GetMapping(value = "/customer")
    public List<Customer> getData() {
        return customerRepository.findAll();
    }

    @GetMapping(value = "/customerByMail/{mail}")
    public Customer getCustomerByMail(@PathVariable String mail) {
        return customerRepository.findByEmail(mail);
    }
}
