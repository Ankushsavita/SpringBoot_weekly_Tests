package com.example.Ecommerce.API.App.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="tbl_Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="address_id")
    private Integer id;

    @Column(name="address_name")
    private String name;

    @Column(name="address_landmark")
    private String landmark;

    @Column(name="address_phone")
    private String phoneNo;

    @Column(name="address_zipcode")
    private String zipcode;

    @Column(name="address_state")
    private String state;

    @ManyToOne
    @JoinColumn(name="user_Id")
    private User user;

}
