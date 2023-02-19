package com.example.Ecommerce.API.App.controller;

import com.example.Ecommerce.API.App.model.Address;
import com.example.Ecommerce.API.App.model.User;
import com.example.Ecommerce.API.App.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/address-app")
public class AddressController {

    @Autowired
    IAddressService addressService;

    @PostMapping("add-address")
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }

    @GetMapping("find-all-address")
    public List<Address> findAll(){
        return addressService.findAll();
    }

    @GetMapping("find-address/id/{id}")
    public Address findAddressById(@PathVariable Integer id){
        return addressService.findAddressById(id);
    }

    @PutMapping("update-address/id/{id}")
    public void updateAddress(@PathVariable Integer id, @RequestBody Address address){
        addressService.updateAddress(id,address);
    }

    @DeleteMapping("delete-address/id/{id}")
    public void deleteAddress(@PathVariable Integer id){
        addressService.deleteAddress(id);
    }
}
