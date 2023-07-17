package com.Restaurant_management_service.Restaurant_management_service.service;

import com.Restaurant_management_service.Restaurant_management_service.model.Order;
import com.Restaurant_management_service.Restaurant_management_service.model.User;
import com.Restaurant_management_service.Restaurant_management_service.repository.IOrederRepo;
import com.Restaurant_management_service.Restaurant_management_service.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    IOrederRepo orderRepo;
    public  void addOrder(Order o) {
        orderRepo.save(o);
    }
    public List<Order> getAllOrder() {
        return orderRepo.findAll();
    }


}
