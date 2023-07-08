package com.example.EmployeeAddressApplication.repository;

import com.example.EmployeeAddressApplication.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Long>{

}
