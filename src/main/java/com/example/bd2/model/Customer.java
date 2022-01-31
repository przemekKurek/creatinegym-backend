package com.example.bd2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Customers")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @Column(name = "email")
    private String email;
}
