package com.example.bd2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customers_requests")
@Data
public class CustomerRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customers_request_id")
    private Long customersRequestId;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "request_type")
    private Long requestType;

    @Column(name = "request_desc")
    private String requestDesc;


}
