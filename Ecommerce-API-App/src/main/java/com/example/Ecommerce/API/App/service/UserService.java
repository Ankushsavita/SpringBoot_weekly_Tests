package com.example.Ecommerce.API.App.service;

import com.example.Ecommerce.API.App.model.User;
import com.example.Ecommerce.API.App.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {
    private static List<User> user = new ArrayList<>();

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Override
    public User findUserById(Integer id){
        return userRepository.findById(id).get();
    }

    @Override
    public void addUser(User user){
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }



    @Override
    public void updateUser(Integer id, User newUser){
        User user = userRepository.findById(id).get();

        user.setId(newUser.getId());
        user.setName(newUser.getName());
        user.setEmail(newUser.getEmail());
        user.setPhoneNumber(newUser.getPhoneNumber());
        user.setPassword(newUser.getPassword());

        userRepository.save(user);
    }


}
