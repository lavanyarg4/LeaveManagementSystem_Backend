package com.stg.leavemanagementsystem.entity;

import com.stg.leavemanagementsystem.enums.Designation;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @Enumerated(EnumType.STRING)
    private Designation designation;

    private LocalDate dateOfJoin;

    // Relationships
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<LeaveRequest> leaveRequests;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    private LeaveBalance leaveBalance;

    // Getters and Setters
}

