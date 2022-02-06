package com.example.bd2.service;

import com.example.bd2.model.Class;
import com.example.bd2.model.CustomerRequest;
import com.example.bd2.model.DTO.ClassDTO;
import com.example.bd2.model.DTO.RequestDTO;
import com.example.bd2.repository.CustomerRepository;
import com.example.bd2.repository.EmployeeRepository;
import com.example.bd2.repository.RoomRepository;
import org.springframework.stereotype.Service;

@Service
public class ClassService {

    private final RoomRepository roomRepository;
    private final EmployeeRepository employeeRepository;
    private final CustomerRepository customerRepository;

    public ClassService(RoomRepository roomRepository, EmployeeRepository employeeRepository, CustomerRepository customerRepository) {
        this.roomRepository = roomRepository;
        this.employeeRepository = employeeRepository;
        this.customerRepository = customerRepository;
    }

    public Class bookClass(ClassDTO classDTO)
    {
        Class response = new Class();
        response.setEmployee(employeeRepository.findById(classDTO.getEmployeeId()).get());
        response.setRoom(roomRepository.getById(classDTO.getRoomId()));
        response.setStartHour(classDTO.getStartHour());
        response.setEndHour(classDTO.getEndHour());
        return response;
    }

    public CustomerRequest makeRequest(RequestDTO requestDTO)
    {
        CustomerRequest response = new CustomerRequest();
        response.setCustomerId(customerRepository.findById(requestDTO.getCustomerId()).get().getCustomerId());
        response.setRequestType(5L);
        response.setRequestDesc(requestDTO.getDescription());
        return response;
    }
}
