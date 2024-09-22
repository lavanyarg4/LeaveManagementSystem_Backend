package com.stg.leavemanagementsystem.controller;

import com.stg.leavemanagementsystem.dtoentity.EmployeeDto;
import com.stg.leavemanagementsystem.entity.Employee;
import com.stg.leavemanagementsystem.serviceinterface.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public Employee addEmployee(@RequestBody EmployeeDto employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Integer id, @RequestBody EmployeeDto employee) {
        return employeeService.updateEmployee(id, employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Integer id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/Hi")
    public Integer hello (@RequestParam Integer id) {
        return id;
    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
