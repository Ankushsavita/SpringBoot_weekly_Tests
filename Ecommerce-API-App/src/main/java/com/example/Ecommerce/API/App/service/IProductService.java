package com.example.Ecommerce.API.App.service;

import com.example.Ecommerce.API.App.model.Product;
import com.example.Ecommerce.API.App.model.User;

import java.util.List;

public interface IProductService {

    public List<Product> findAll();

    public Product findProductById(Integer id);

    public void addProduct(Product product);

    public void deleteProduct(Integer id);

    public void updateProduct(Integer id, Product newProduct);
}
