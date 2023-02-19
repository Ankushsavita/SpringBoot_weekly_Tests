package com.example.Ecommerce.API.App.controller;

import com.example.Ecommerce.API.App.model.User;
import com.example.Ecommerce.API.App.service.IUserService;
import com.example.Ecommerce.API.App.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user-app")
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("add-user")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping("find-all-users")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("find-user/id/{id}")
    public User findUserById(@PathVariable Integer id){
        return userService.findUserById(id);
    }

    @PutMapping("update-user/id/{id}")
    public void updateUser(@PathVariable Integer id, @RequestBody User user){
        userService.updateUser(id,user);
    }

    @DeleteMapping("delete-user/id/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }
}
