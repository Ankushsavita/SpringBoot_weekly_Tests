package com.example.Restaurant.service;

import com.example.Restaurant.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class RestaurantService {
    private static  List<Restaurant> restaurants = new ArrayList<>();
    private static int RestoCount = 0;

    static{
        restaurants.add(new Restaurant("Domino", "sanjay place", ++RestoCount, "Pizza" , 5));
        restaurants.add(new Restaurant("Cafe", "sanjay place", ++RestoCount, "Pizza" , 5));
        restaurants.add(new Restaurant("Bang", "sanjay place", ++RestoCount, "Pizza" , 5));
        restaurants.add(new Restaurant("BurgerKing", "sanjay place", ++RestoCount, "Pizza" , 5));
        restaurants.add(new Restaurant("Momocorner", "sanjay place", ++RestoCount, "Pizza" , 5));

    }

    public List<Restaurant> findAll(){ // business logic
        return restaurants;
    }

    public Restaurant findByName(String name) { // business logic
        Predicate<? super Restaurant> predicate = restaurant -> restaurant.getName() == name;
        Restaurant restaurant = restaurants.stream().filter(predicate).findFirst().get();
        return restaurant;
    }


}
