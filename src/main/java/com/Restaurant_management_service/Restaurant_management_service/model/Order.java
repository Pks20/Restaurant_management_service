package com.Restaurant_management_service.Restaurant_management_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long OrderId;
    private Long FoodItemId;
    private Long UserId;
    private Integer Quantity;
    private String Status;
    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    User user;
}
