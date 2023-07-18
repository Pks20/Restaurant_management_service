package com.Restaurant_management_service.Restaurant_management_service.repository;

import com.Restaurant_management_service.Restaurant_management_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Order,Integer> {
}
