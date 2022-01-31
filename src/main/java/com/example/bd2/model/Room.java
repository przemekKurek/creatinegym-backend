package com.example.bd2.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "rooms")
@Data
public class Room implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long roomId;

    @Column(name = "capacity")
    private Long capacity;

    @Column(name = "branch_id")
    private Long branchId;

    @Column(name = "room_type_id")
    private Long roomTypeId;

    @Column(name = "name")
    private String name;
}
