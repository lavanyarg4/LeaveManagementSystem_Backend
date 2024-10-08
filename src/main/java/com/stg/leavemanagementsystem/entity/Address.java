package com.stg.leavemanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Entity

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String street;
    private String city;
    private String state;
    private String country;
    private String zip;

    // Getters and Setters
}
