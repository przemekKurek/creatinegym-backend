package com.example.bd2.controller;

import com.example.bd2.model.DTO.MembershipCardDTO;
import com.example.bd2.model.MembershipCard;
import com.example.bd2.repository.MembershipCardRepository;
import com.example.bd2.service.MembershipCardService;
import org.springframework.web.bind.annotation.*;

@RestController
public class MembershipCardController {

    private final MembershipCardService membershipCardService;
    private final MembershipCardRepository membershipCardRepository;


    public MembershipCardController(MembershipCardService membershipCardService, MembershipCardRepository membershipCardRepository) {
        this.membershipCardService = membershipCardService;
        this.membershipCardRepository = membershipCardRepository;
    }

    @PostMapping(value = "/buyCard", consumes = "application/json")
    public MembershipCard buyCard(@RequestBody MembershipCardDTO request)
    {
        MembershipCard response;
        response = membershipCardService.buyMembershipCard(request);
        return membershipCardRepository.save(response);

    }

    @DeleteMapping(value = "/getOut", consumes = "application/json")
    public void deleteQuestion(@RequestBody MembershipCardDTO request)
    {
        MembershipCard response;
        response = membershipCardRepository.getById(request.getMembershipCardTypeId());
        membershipCardRepository.delete(response);
    }
}
