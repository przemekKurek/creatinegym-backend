package com.example.bd2.service;

import com.example.bd2.model.DTO.MembershipCardDTO;
import com.example.bd2.model.MembershipCard;
import com.example.bd2.model.dictionary.repository.MembershipCardDictRepository;
import com.example.bd2.repository.CustomerRepository;
import com.example.bd2.repository.MembershipCardRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MembershipCardService {

    private final MembershipCardDictRepository membershipCardDictRepository;
    private final MembershipCardRepository membershipCardRepository;
    private final CustomerRepository customerRepository;

    public MembershipCardService(MembershipCardDictRepository membershipCardDictRepository, MembershipCardRepository membershipCardRepository, CustomerRepository customerRepository) {
        this.membershipCardDictRepository = membershipCardDictRepository;
        this.membershipCardRepository = membershipCardRepository;
        this.customerRepository = customerRepository;
    }

    public MembershipCard buyMembershipCard(MembershipCardDTO membershipCardDTO)
    {
        MembershipCard membershipCard = new MembershipCard();
        membershipCard.setCustomer(customerRepository.findById(membershipCardDTO.getCustomerId()).get());
        membershipCard.setOrderDate(LocalDateTime.now());
        membershipCard.setMembershipCardType(membershipCardDictRepository.findById(membershipCardDTO.getMembershipCardTypeId()).get());
        return membershipCard;
    }
}
