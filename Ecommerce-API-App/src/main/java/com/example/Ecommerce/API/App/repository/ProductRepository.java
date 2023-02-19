package com.example.Ecommerce.API.App.repository;

import com.example.Ecommerce.API.App.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
