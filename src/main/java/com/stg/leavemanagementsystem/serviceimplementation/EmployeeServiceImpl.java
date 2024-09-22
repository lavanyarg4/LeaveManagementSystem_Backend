package com.stg.leavemanagementsystem.serviceimplementation;

import com.stg.leavemanagementsystem.dtoentity.EmployeeDto;
import com.stg.leavemanagementsystem.entity.Address;
import com.stg.leavemanagementsystem.entity.Employee;
import com.stg.leavemanagementsystem.repository.EmployeeRepository;
import com.stg.leavemanagementsystem.serviceinterface.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(EmployeeDto employee) {

        Employee employee1 = new Employee();
        Address address = new Address();
        employee1.setFirstName(employee.getFirstName());
        employee1.setLastName(employee.getLastName());
        employee1.setEmail(employee.getEmail());
        employee1.setPhone(employee.getPhone());
        employee1.setDateOfJoin(employee.getDateOfJoin());
        employee1.setDesignation(employee.getDesignation());
        address.setStreet(employee.getAddress().getStreet());
        address.setCity(employee.getAddress().getCity());
        address.setState(employee.getAddress().getState());
        address.setCountry(employee.getAddress().getCountry());
        address.setZip(employee.getAddress().getZip());


        employee1.setAddress(address);


        return employeeRepository.save(employee1);
    }

    @Override
    public Employee updateEmployee(Integer id, EmployeeDto employee) {
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));

        Address address = existingEmployee.getAddress();

//        existingEmployee.setFirstName(employee.getFirstName());
//        existingEmployee.setLastName(employee.getLastName());
//        existingEmployee.setEmail(employee.getEmail());
//        existingEmployee.setPhone(employee.getPhone());
        // Additional setters

        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setPhone(employee.getPhone());
//        existingEmployee.setDateOfJoin(employee.getDateOfJoin());
        existingEmployee.setDesignation(employee.getDesignation());



        address.setStreet(employee.getAddress().getStreet());
        address.setCity(employee.getAddress().getCity());
        address.setState(employee.getAddress().getState());
        address.setCountry(employee.getAddress().getCountry());
        address.setZip(employee.getAddress().getZip());

        existingEmployee.setAddress(address);


//

        return employeeRepository.save(existingEmployee);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
