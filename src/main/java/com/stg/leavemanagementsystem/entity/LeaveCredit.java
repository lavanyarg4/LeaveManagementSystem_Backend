package com.stg.leavemanagementsystem.entity;

import com.stg.leavemanagementsystem.enums.CreditStatus;
import com.stg.leavemanagementsystem.enums.Designation;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;

@Data
@Entity
public class LeaveCredit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Designation employeeDesignation;

    private int sickLeaves;
    private int casualLeaves;
    private int earnedLeaves;

    private LocalDate effectiveDate;

    @Enumerated(EnumType.STRING)
    private CreditStatus status;

    // Getters and Setters
}

