package com.example.Restaurant.controller;

import com.example.Restaurant.model.Restaurant;
import com.example.Restaurant.service.RestaurantService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/Restaurant-app")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService){
        this.restaurantService = restaurantService;
    }


    @PostMapping
    public void addRestaurant(@RequestBody Restaurant restaurant){
    }

    // http://localhost:8080/api/v1/Restaurant-app/find-all
    @GetMapping("/find-Restaurant/name/{name}")
    public Restaurant findRestaurantByName(@PathVariable String name){
        return restaurantService.findByName(name);
    }

    @GetMapping("find-all")
    public List<Restaurant> findAllRestaurants(){
        return restaurantService.findAll();
    }

}
