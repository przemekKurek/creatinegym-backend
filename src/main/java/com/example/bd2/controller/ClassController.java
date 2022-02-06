package com.example.bd2.controller;

import com.example.bd2.model.Class;
import com.example.bd2.model.DTO.ClassDTO;
import com.example.bd2.repository.ClassRepository;
import com.example.bd2.service.ClassService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassController {

    private final ClassService classService;
    private final ClassRepository classRepository;

    public ClassController(ClassService classService, ClassRepository classRepository) {
        this.classService = classService;
        this.classRepository = classRepository;
    }

    @PostMapping(value = "/bookClass", consumes = "application/json")
    public Class bookClass(@RequestBody ClassDTO request)
    {
        Class response = classService.bookClass(request);
        return classRepository.save(response);

    }


}
