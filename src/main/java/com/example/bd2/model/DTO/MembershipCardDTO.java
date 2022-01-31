package com.example.bd2.model.DTO;


import lombok.Data;

import java.time.LocalDateTime;
@Data
public class MembershipCardDTO {

    //private LocalDateTime orderDate;

    private Long customerId;

    private Long membershipCardTypeId;
}
