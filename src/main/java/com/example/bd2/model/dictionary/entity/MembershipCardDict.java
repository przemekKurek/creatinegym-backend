package com.example.bd2.model.dictionary.entity;

import com.example.bd2.model.Customer;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "membership_cards_dict")
@Data
public class MembershipCardDict {
    @Id
    @Column(name = "membership_card_type_id")
    private Long membershipCardTypeId;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "duration_days")
    private Long durationDays;

}