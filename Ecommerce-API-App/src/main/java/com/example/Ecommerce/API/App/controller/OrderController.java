package com.example.Ecommerce.API.App.controller;

import com.example.Ecommerce.API.App.model.Order;
import com.example.Ecommerce.API.App.model.Product;
import com.example.Ecommerce.API.App.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/order-app")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @PostMapping("/order")
    public ResponseEntity<Order> placeOrder(@RequestParam Integer userId, @RequestParam Integer productId, @RequestParam Integer addressId) {
        Order order = orderService.placeOrder(userId, productId, addressId);
        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }

    @GetMapping("find-all-orders")
    public List<Order> findAll(){
        return orderService.findAll();
    }

    @GetMapping("find-order/id/{id}")
    public Order findOrderById(@PathVariable Integer id){
        return orderService.findOrderById(id);
    }

    @PutMapping("update-order/id/{id}")
    public void updateOrder(@PathVariable Integer id, @RequestBody Order order){
        orderService.updateOrder(id,order);
    }

    @DeleteMapping("delete-order/id/{id}")
    public void deleteOrder(@PathVariable Integer id){
        orderService.deleteOrder(id);
    }
}
