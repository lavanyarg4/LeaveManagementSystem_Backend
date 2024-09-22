package com.stg.leavemanagementsystem.dtoentity;

import lombok.Data;

@Data
public class LoginResponse {
    private String status;
    private String role;

    public LoginResponse(String status, String role) {
        this.status = status;
        this.role = role;
    }
}
