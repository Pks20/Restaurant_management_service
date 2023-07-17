package com.Restaurant_management_service.Restaurant_management_service.repository;

import com.Restaurant_management_service.Restaurant_management_service.model.FoodItem;
import com.Restaurant_management_service.Restaurant_management_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodItemRepo extends JpaRepository<FoodItem,Long> {
}
