package com.example.Ecommerce.API.App.service;

import com.example.Ecommerce.API.App.model.Address;
import com.example.Ecommerce.API.App.model.User;

import java.util.List;

public interface IAddressService {


    public List<Address> findAll();

    public Address findAddressById(Integer id);

    public void addAddress(Address address);

    public void deleteAddress(Integer id);

    public void updateAddress(Integer id, Address newAddress);
}
