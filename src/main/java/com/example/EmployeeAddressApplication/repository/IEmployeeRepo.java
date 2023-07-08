package com.example.EmployeeAddressApplication.repository;

import com.example.EmployeeAddressApplication.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends CrudRepository<Employee,Long> {
}
