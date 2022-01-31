package com.example.bd2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "classes")
@Data
public class Class implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Long classId;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee; //[ powinno być klasa employee

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Room room;

    @Column(name = "start_hour")
    private Long startHour;

    @Column(name = "end_hour")
    private Long endHour;
}
