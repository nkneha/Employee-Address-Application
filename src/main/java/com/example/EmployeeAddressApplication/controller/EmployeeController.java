package com.example.EmployeeAddressApplication.controller;

import com.example.EmployeeAddressApplication.model.Employee;
import com.example.EmployeeAddressApplication.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("employee")
    public Iterable<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }
    @GetMapping("employee/id")
    public Employee getEmployeebyid(@RequestParam("id") Long employeeId)
    {
        return employeeService.getEmployeebyid(employeeId);
    }
    @PostMapping("employee")
    public String addEmployee(@RequestBody @Valid Employee employee)
    {
        return employeeService.addEmployee(employee);
    }
    @PutMapping("employee")

    public String UpdateEmployee(@RequestParam("id") Long employeeId, @RequestParam("lastName") String lastName)
    {
        return employeeService.UpdateEmployee(employeeId,lastName);
    }
    @DeleteMapping("employee")

    public String DeleteEmployee(@RequestParam("id") Long employeeId)
    {
        return employeeService.DeleteEmployee(employeeId);
    }
}
