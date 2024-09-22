package com.stg.leavemanagementsystem.controller;

import com.stg.leavemanagementsystem.entity.CompanyHoliday;
import com.stg.leavemanagementsystem.serviceinterface.CompanyHolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/holidays")
@CrossOrigin(origins = "http://localhost:4200")
public class CompanyHolidayController {

    @Autowired
    private CompanyHolidayService holidayService;

    @PostMapping("/createHoliday")
    public CompanyHoliday addHoliday(@RequestBody CompanyHoliday holiday) {
        return holidayService.addHoliday(holiday);
    }

    @GetMapping("/showHolidays")
    public List<CompanyHoliday> getAllHolidays() {

        return holidayService.getAllHolidays();
    }
}

