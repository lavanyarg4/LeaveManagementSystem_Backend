package com.stg.leavemanagementsystem.entity;

import com.stg.leavemanagementsystem.enums.LeaveStatus;
import com.stg.leavemanagementsystem.enums.LeaveType;
import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;

@Data
@Entity
public class LeaveRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    private LocalDate startDate;
    private LocalDate endDate;
    private int numberOfDays;

    @Enumerated(EnumType.STRING)
    private LeaveType leaveType;

    private String reason;

    @Enumerated(EnumType.STRING)
    private LeaveStatus status;

    // Getters and Setters
}

