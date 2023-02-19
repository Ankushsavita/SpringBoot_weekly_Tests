package com.example.Ecommerce.API.App.service;

import com.example.Ecommerce.API.App.model.Address;
import com.example.Ecommerce.API.App.model.User;
import com.example.Ecommerce.API.App.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService implements IAddressService{
    private static List<Address> address = new ArrayList<>();

    @Autowired
    AddressRepository addressRepository;

    @Override
    public List<Address> findAll(){
        return addressRepository.findAll();
    }

    @Override
    public Address findAddressById(Integer id){
        return addressRepository.findById(id).get();
    }

    @Override
    public void addAddress(Address address){
        addressRepository.save(address);
    }

    @Override
    public void deleteAddress(Integer id){
        addressRepository.deleteById(id);
    }



    @Override
    public void updateAddress(Integer id, Address newAddress){
        Address address = addressRepository.findById(id).get();

        address.setId(newAddress.getId());
        address.setName(newAddress.getName());
        address.setLandmark(newAddress.getLandmark());
        address.setPhoneNo(newAddress.getPhoneNo());
        address.setZipcode(newAddress.getZipcode());
        address.setState(newAddress.getState());

        addressRepository.save(address);
    }
}
