package com.example.bd2.controller;

import com.example.bd2.model.CustomerRequest;
import com.example.bd2.model.DTO.RequestDTO;
import com.example.bd2.repository.CustomerRequestRepository;
import com.example.bd2.service.ClassService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CustomersRequestController {

    private ClassService classService;
    private CustomerRequestRepository customerRequestRepository;

    public CustomersRequestController(ClassService classService) {
        this.classService = classService;
    }

    @PostMapping(value = "/makeRequest", consumes = "application/json")
    public CustomerRequest makeRequest(@RequestBody RequestDTO request)
    {

        CustomerRequest response = classService.makeRequest(request);
        return customerRequestRepository.save(response);

    }

}
