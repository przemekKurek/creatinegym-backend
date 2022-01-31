package com.example.bd2.model.dictionary.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "employees_dict")
@Data
public class EmployeeDict implements Serializable {
    @Id
    @Column(name = "employee_type_id")
    private Long employeeTypeId;

    @Column(name = "description")
    private String description;

}