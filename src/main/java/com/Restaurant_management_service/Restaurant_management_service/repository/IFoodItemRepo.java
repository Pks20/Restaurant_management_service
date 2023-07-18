package com.Restaurant_management_service.Restaurant_management_service.repository;

import com.Restaurant_management_service.Restaurant_management_service.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoodItemRepo extends JpaRepository<FoodItem,Integer> {
}
