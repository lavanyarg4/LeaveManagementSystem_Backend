package com.stg.leavemanagementsystem.repository;

import com.stg.leavemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findByUserNameAndPassword(String username, String password);
}
