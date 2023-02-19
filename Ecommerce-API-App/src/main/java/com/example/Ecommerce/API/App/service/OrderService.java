package com.example.Ecommerce.API.App.service;

import com.example.Ecommerce.API.App.model.Address;
import com.example.Ecommerce.API.App.model.Order;
import com.example.Ecommerce.API.App.model.Product;
import com.example.Ecommerce.API.App.model.User;
import com.example.Ecommerce.API.App.repository.AddressRepository;
import com.example.Ecommerce.API.App.repository.OrderRepository;
import com.example.Ecommerce.API.App.repository.ProductRepository;
import com.example.Ecommerce.API.App.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService implements IOrderService {
    private static List<Order> order = new ArrayList<>();

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Order placeOrder(Integer userId, Integer productId, Integer addressId) {
        User user = userRepository.findById(userId).get();
        Product product = productRepository.findById(productId).get();
        Address address = addressRepository.findById(addressId).get();
        Order order = new Order();
        order.setUser(user);
        order.setProduct(product);
        order.setAddress(address);
        return orderRepository.save(order);
    }


    @Override
    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    @Override
    public Order findOrderById(Integer id){
        return orderRepository.findById(id).get();
    }
//
//    @Override
//    public void addOrder(Order order){
//        orderRepository.save(order);
//    }

    @Override
    public void deleteOrder(Integer id){
        orderRepository.deleteById(id);
    }



    @Override
    public void updateOrder(Integer id, Order newOrder){
        Order order = orderRepository.findById(id).get();

        order.setId(newOrder.getId());
        order.setProduct_quantity(newOrder.getProduct_quantity());


        orderRepository.save(order);
    }
}
