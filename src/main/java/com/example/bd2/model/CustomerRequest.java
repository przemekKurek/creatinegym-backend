package com.example.bd2.model;

import com.example.bd2.model.dictionary.entity.CustonerRequestDict;
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

    @ManyToOne
    @JoinColumn(name = "request_type")
    private CustonerRequestDict requestType;

    @Column(name = "request_desc")
    private String requestDesc;

    @Column(name = "status")
    private String status;


}
