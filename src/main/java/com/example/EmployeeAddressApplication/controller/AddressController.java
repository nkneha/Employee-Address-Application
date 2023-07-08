package com.example.EmployeeAddressApplication.controller;

import com.example.EmployeeAddressApplication.model.Address;
import com.example.EmployeeAddressApplication.service.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("address")
    public Iterable<Address> getAllAddress()
    {
        return addressService.getAllAddress();
    }

    @GetMapping("address/id")
    public Address getAddressbyid(@RequestParam("id") Long addId)
    {
        return addressService.getAddressbyid(addId);
    }
    @PostMapping("address")
    public String addAddress(@RequestBody @Valid Address address)
    {

        return addressService.addAddress(address);
    }
    @PutMapping("address")
    public String UpdateAddress (@RequestParam("id") Long addId, @RequestParam("street") String addStreet)
    {
        return addressService.UpdateAddress (addId,addStreet);
    }
    @DeleteMapping("address")

    public String DeleteAddress(@RequestParam("id") Long addId)
    {
        return addressService.DeleteAddress(addId);
    }

}
