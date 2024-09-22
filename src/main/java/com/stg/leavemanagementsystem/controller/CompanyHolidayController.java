package com.stg.leavemanagementsystem.controller;

import com.stg.leavemanagementsystem.entity.CompanyHoliday;
import com.stg.leavemanagementsystem.serviceinterface.CompanyHolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/holidays")
public class CompanyHolidayController {

    @Autowired
    private CompanyHolidayService holidayService;

    @PostMapping
    public CompanyHoliday addHoliday(@RequestBody CompanyHoliday holiday) {
        return holidayService.addHoliday(holiday);
    }

    @GetMapping
    public List<CompanyHoliday> getAllHolidays() {
        return holidayService.getAllHolidays();
    }
}

