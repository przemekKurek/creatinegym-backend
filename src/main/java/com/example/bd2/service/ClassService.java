package com.example.bd2.service;

import com.example.bd2.model.Class;
import com.example.bd2.model.CustomerRequest;
import com.example.bd2.model.DTO.ClassDTO;
import com.example.bd2.model.DTO.RequestDTO;
import com.example.bd2.model.dictionary.entity.CustonerRequestDict;
import com.example.bd2.model.dictionary.repository.CustonerRequestDictRepository;
import com.example.bd2.repository.CustomerRepository;
import com.example.bd2.repository.EmployeeRepository;
import com.example.bd2.repository.RoomRepository;
import org.springframework.stereotype.Service;

@Service
public class ClassService {

    private final RoomRepository roomRepository;
    private final EmployeeRepository employeeRepository;
    private final CustomerRepository customerRepository;
    private final CustonerRequestDictRepository custonerRequestDictRepository;

    public ClassService(RoomRepository roomRepository, EmployeeRepository employeeRepository, CustomerRepository customerRepository, CustonerRequestDictRepository custonerRequestDictRepository) {
        this.roomRepository = roomRepository;
        this.employeeRepository = employeeRepository;
        this.customerRepository = customerRepository;
        this.custonerRequestDictRepository = custonerRequestDictRepository;
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
        response.setRequestType(custonerRequestDictRepository.findById(3L).get());
        response.setRequestDesc(requestDTO.getDescription());
        response.setStatus("pending");
        return response;
    }
}
