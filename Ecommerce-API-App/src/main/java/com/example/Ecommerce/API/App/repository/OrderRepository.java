package com.example.Ecommerce.API.App.repository;

import com.example.Ecommerce.API.App.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
}