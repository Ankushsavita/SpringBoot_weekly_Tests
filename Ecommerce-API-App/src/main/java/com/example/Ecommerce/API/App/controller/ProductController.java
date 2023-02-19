package com.example.Ecommerce.API.App.controller;

import com.example.Ecommerce.API.App.model.Product;
import com.example.Ecommerce.API.App.model.User;
import com.example.Ecommerce.API.App.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product-app")
public class ProductController {

    @Autowired
    IProductService productService;


    @PostMapping("add-product")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @GetMapping("find-all-products")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("find-product/id/{id}")
    public Product findProductById(@PathVariable Integer id){
        return productService.findProductById(id);
    }

    @PutMapping("update-product/id/{id}")
    public void updateProduct(@PathVariable Integer id, @RequestBody Product product){
        productService.updateProduct(id,product);
    }

    @DeleteMapping("delete-product/id/{id}")
    public void deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
    }

}
