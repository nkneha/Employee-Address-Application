package com.example.EmployeeAddressApplication.service;

import com.example.EmployeeAddressApplication.model.Employee;
import com.example.EmployeeAddressApplication.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo iEmployeeRepo;
    public Iterable<Employee> getAllEmployees() {
        return iEmployeeRepo.findAll();
    }

    public Employee getEmployeebyid(Long employeeId) {
        Optional<Employee> optional= iEmployeeRepo.findById(employeeId);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;

    }

    public String addEmployee(Employee employee) {
        iEmployeeRepo.save(employee);
        return "Employee Added";
    }

    public String UpdateEmployee(Long employeeId, String lastName) {
        if(iEmployeeRepo.existsById(employeeId)){
            Employee employee = getEmployeebyid(employeeId);
            employee.setLastName(lastName);
            iEmployeeRepo.save(employee);
            return "Employee Updated";
        }
        else{
            return "Employee  Id does not exist";
        }
    }

    public String DeleteEmployee(Long employeeId) {
        if(iEmployeeRepo.existsById(employeeId)){
            iEmployeeRepo.deleteById(employeeId);
            return "Employee Deleted";
        }
        else{
            return "Employee Id does not exist";
        }
    }
}
