package com.example.bd2.service;

import com.example.bd2.model.Class;
import com.example.bd2.model.DTO.ClassDTO;
import com.example.bd2.repository.EmployeeRepository;
import com.example.bd2.repository.RoomRepository;
import org.springframework.stereotype.Service;

@Service
public class ClassService {

    private final RoomRepository roomRepository;
    private final EmployeeRepository employeeRepository;

    public ClassService(RoomRepository roomRepository, EmployeeRepository employeeRepository) {
        this.roomRepository = roomRepository;
        this.employeeRepository = employeeRepository;
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
}
