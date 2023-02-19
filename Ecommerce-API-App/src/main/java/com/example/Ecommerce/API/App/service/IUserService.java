package com.example.Ecommerce.API.App.service;

import com.example.Ecommerce.API.App.model.User;

import java.util.List;

public interface IUserService{

    public List<User> findAll();

    public User findUserById(Integer id);

    public void addUser(User user);

    public void deleteUser(Integer id);

    public void updateUser(Integer id, User newUser);
}
