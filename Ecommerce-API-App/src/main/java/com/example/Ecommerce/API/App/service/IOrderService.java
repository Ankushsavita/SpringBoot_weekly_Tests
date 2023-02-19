package com.example.Ecommerce.API.App.service;

import com.example.Ecommerce.API.App.model.Order;
import com.example.Ecommerce.API.App.model.Product;

import java.util.List;

public interface IOrderService {

    public Order placeOrder(Integer userId, Integer productId, Integer addressId);

    public List<Order> findAll();

    public Order findOrderById(Integer id);

    public void deleteOrder(Integer id);

    public void updateOrder(Integer id, Order newOrder);
}
