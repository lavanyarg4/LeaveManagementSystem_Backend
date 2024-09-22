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
    private String userName;
    @Column(unique = true)
    private String password;
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
    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public LocalDate getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(LocalDate dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public List<LeaveRequest> getLeaveRequests() {
        return leaveRequests;
    }

    public void setLeaveRequests(List<LeaveRequest> leaveRequests) {
        this.leaveRequests = leaveRequests;
    }

    public LeaveBalance getLeaveBalance() {
        return leaveBalance;
    }

    public void setLeaveBalance(LeaveBalance leaveBalance) {
        this.leaveBalance = leaveBalance;
    }
}

