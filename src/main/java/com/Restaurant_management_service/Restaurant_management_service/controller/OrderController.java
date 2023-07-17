package com.Restaurant_management_service.Restaurant_management_service.controller;

import com.Restaurant_management_service.Restaurant_management_service.model.Order;
import com.Restaurant_management_service.Restaurant_management_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;


    @PostMapping("order")
    void addOrder(@RequestBody Order o)
    {
        orderService.addOrder(o);
    }

    @GetMapping("doctors")
    List<Order> getAllOrder()
    {
        return orderService.getAllOrder();
    }
}
