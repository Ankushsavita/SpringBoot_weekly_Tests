package com.example.Ecommerce.API.App.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_product")
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="product_id")
    private Integer id;

    @Column(name="product_name")
    private String name;

    @Column(name="product_price")
    private Integer price;

    @Column(name="product_desc")
    private String description;

    @Column(name="product_category")
    private String category;

    @Column(name="product_brand")
    private String brand;
}
