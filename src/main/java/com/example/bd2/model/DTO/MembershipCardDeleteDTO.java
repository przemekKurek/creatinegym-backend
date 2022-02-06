package com.example.bd2.model.DTO;

import lombok.Data;

@Data
public class MembershipCardDeleteDTO {
    private Long customerId;
    private Long membershipId;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Long membershipId) {
        this.membershipId = membershipId;
    }
}
