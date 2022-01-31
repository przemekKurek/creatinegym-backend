package com.example.bd2.model.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ClassDTO {

    private Long roomId;
    private Long employeeId;
    private Long startHour;
    private Long endHour;

}
