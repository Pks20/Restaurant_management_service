package com.Restaurant_management_service.Restaurant_management_service.controller;

import com.Restaurant_management_service.Restaurant_management_service.model.Order;
import com.Restaurant_management_service.Restaurant_management_service.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("order/{userId}")
    public Order generateFoodOrder(@RequestBody @Valid Order order, @RequestParam @Valid Integer userId) {
        return orderService.generateFoodOrder(order, userId);
    }

    @GetMapping("orders")
    List<Order> getAllOrders()
    {
        return orderService.getAllOrders();
    }
}
