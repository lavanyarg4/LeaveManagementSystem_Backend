package com.stg.leavemanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;

@Data
@Entity
public class LeaveBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

    private int sickLeaves;
    private int casualLeaves;
    private int earnedLeaves;
    private int lossOfPay;

    private LocalDate lastCreditedDate;

    // Getters and Setters
}
