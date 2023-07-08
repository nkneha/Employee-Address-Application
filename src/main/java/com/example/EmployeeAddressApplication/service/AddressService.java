package com.example.EmployeeAddressApplication.service;

import com.example.EmployeeAddressApplication.model.Address;
import com.example.EmployeeAddressApplication.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;
    public Iterable<Address> getAllAddress() {
        return iAddressRepo.findAll();
    }

    public Address getAddressbyid(Long addId) {

        Optional<Address> optional=iAddressRepo.findById(addId);

        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    public String addAddress(Address address) {
        iAddressRepo.save(address);
        return "Address Added";
    }

    public String UpdateAddress(Long addId, String addStreet) {
        if(iAddressRepo.existsById(addId)){
            Address address = getAddressbyid(addId);
            address.setStreet(addStreet);
            iAddressRepo.save(address);
            return "Address Updated";
        }
        else{
            return "Address Id does not exist";
        }
    }

    public String DeleteAddress(Long addId) {
        if(iAddressRepo.existsById(addId)){
            iAddressRepo.deleteById(addId);
            return "Address deleted";
        }
        else{
            return "Address Id does not exist";
        }
    }
}
