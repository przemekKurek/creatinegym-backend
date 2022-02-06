package com.example.bd2.model.DTO;


import lombok.Data;

import java.time.LocalDateTime;
@Data
public class MembershipCardDTO {

    //private LocalDateTime orderDate;

    private Long customerId;

    private Long membershipCardTypeId;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getMembershipCardTypeId() {
        return membershipCardTypeId;
    }

    public void setMembershipCardTypeId(Long membershipCardTypeId) {
        this.membershipCardTypeId = membershipCardTypeId;
    }
}
