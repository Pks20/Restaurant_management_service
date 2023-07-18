package com.Restaurant_management_service.Restaurant_management_service.service;

import com.Restaurant_management_service.Restaurant_management_service.model.FoodItem;
import com.Restaurant_management_service.Restaurant_management_service.model.User;
import com.Restaurant_management_service.Restaurant_management_service.model.UserType;
import com.Restaurant_management_service.Restaurant_management_service.repository.IFoodItemRepo;
import com.Restaurant_management_service.Restaurant_management_service.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {
    @Autowired
    IFoodItemRepo iFoodItemRepo;

    @Autowired
    IUserRepo iUserRepo;

    public FoodItem createFoodItem(FoodItem foodItem, Integer userId) {

        // Check if the user is an admin
        User user = iUserRepo.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        String newEmail = user.getUserEmail();
        UserType type = user.getUserType();
        if(!type.equals(UserType.Admin) && !newEmail.endsWith(("@admin.com"))){
            throw new IllegalArgumentException("Only admins can create food items");
        }

        // Create the food item
        return iFoodItemRepo.save(foodItem);
    }

    public List<FoodItem> getAllFoodItems() {
        return iFoodItemRepo.findAll();
    }
}
