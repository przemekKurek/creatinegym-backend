package com.example.bd2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Blacklist")
@Data
public class BlackList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blacklist_id")
    private Long blackListId;

    @OneToOne()
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "reason")
    private String reason;

}
