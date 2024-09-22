package com.stg.leavemanagementsystem.repository;

import com.stg.leavemanagementsystem.entity.CompanyHoliday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyHolidayRepository extends JpaRepository<CompanyHoliday, Integer> {
}
