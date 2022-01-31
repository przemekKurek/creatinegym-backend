package com.example.bd2.model;

import com.example.bd2.model.dictionary.entity.MembershipCardDict;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "membership_cards")
@Data
public class MembershipCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "membership_card_id")
    private Long membershipCardId;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne()
    @JoinColumn(name = "membership_card_type")
    private MembershipCardDict membershipCardType;
}
