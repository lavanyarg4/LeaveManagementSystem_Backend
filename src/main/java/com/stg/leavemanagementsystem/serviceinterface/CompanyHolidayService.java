package com.stg.leavemanagementsystem.serviceinterface;

import com.stg.leavemanagementsystem.entity.CompanyHoliday;

import java.util.List;

public interface CompanyHolidayService {
    CompanyHoliday addHoliday(CompanyHoliday holiday);
    List<CompanyHoliday> getAllHolidays();
}

