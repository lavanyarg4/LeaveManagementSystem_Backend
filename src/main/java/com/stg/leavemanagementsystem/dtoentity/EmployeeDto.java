package com.stg.leavemanagementsystem.dtoentity;

import com.stg.leavemanagementsystem.entity.Address;
import com.stg.leavemanagementsystem.enums.Designation;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeDto {

    private Integer id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Designation designation;
    private LocalDate dateOfJoin;
    private Address address;

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
}
