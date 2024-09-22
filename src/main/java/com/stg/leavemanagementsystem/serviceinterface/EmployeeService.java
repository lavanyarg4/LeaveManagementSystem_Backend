package com.stg.leavemanagementsystem.serviceinterface;

import com.stg.leavemanagementsystem.dtoentity.EmployeeDto;
import com.stg.leavemanagementsystem.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(EmployeeDto employee);
    Employee updateEmployee(Integer id, EmployeeDto employee);
    Employee getEmployeeById(Integer id);
    void deleteEmployee(Integer id);
    List<Employee> getAllEmployees();
}
