package com.stg.leavemanagementsystem.serviceimplementation;

import com.stg.leavemanagementsystem.entity.CompanyHoliday;
import com.stg.leavemanagementsystem.repository.CompanyHolidayRepository;
import com.stg.leavemanagementsystem.serviceinterface.CompanyHolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyHolidayServiceImpl implements CompanyHolidayService {

    @Autowired
    private CompanyHolidayRepository holidayRepository;

    @Override
    public CompanyHoliday addHoliday(CompanyHoliday holiday) {
        return holidayRepository.save(holiday);
    }

    @Override
    public List<CompanyHoliday> getAllHolidays() {
        return holidayRepository.findAll();
    }
}
