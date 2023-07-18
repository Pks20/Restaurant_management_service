package com.Restaurant_management_service.Restaurant_management_service.repository;

import com.Restaurant_management_service.Restaurant_management_service.model.AuthenticationToken;
import com.Restaurant_management_service.Restaurant_management_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthTokenRepo extends JpaRepository<AuthenticationToken,Integer> {

}
