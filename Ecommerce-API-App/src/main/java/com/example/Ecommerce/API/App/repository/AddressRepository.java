package com.example.Ecommerce.API.App.repository;

import com.example.Ecommerce.API.App.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {
}
