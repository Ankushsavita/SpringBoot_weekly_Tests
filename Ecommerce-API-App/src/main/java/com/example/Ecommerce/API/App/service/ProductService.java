package com.example.Ecommerce.API.App.service;

import com.example.Ecommerce.API.App.model.Product;
import com.example.Ecommerce.API.App.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService{
    private static List<Product> product = new ArrayList<>();

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @Override
    public Product findProductById(Integer id){
        return productRepository.findById(id).get();
    }

    @Override
    public void addProduct(Product product){
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }



    @Override
    public void updateProduct(Integer id, Product newProduct){
        Product product = productRepository.findById(id).get();

        product.setId(newProduct.getId());
        product.setName(newProduct.getName());
        product.setPrice(newProduct.getPrice());
        product.setDescription(newProduct.getDescription());
        product.setCategory(newProduct.getCategory());
        product.setBrand(newProduct.getBrand());


        productRepository.save(product);
    }

}
