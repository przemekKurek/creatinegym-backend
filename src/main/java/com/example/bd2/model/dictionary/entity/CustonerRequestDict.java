package com.example.bd2.model.dictionary.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "customers_requests_dict")
@Data
public class CustonerRequestDict implements Serializable {
    @Id
    @Column(name = "customers_request_type_id")
    private Long requestTypeId;

    @Column(name = "description")
    private String description;

}