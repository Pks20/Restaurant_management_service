package com.Restaurant_management_service.Restaurant_management_service.repository;

import com.Restaurant_management_service.Restaurant_management_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Integer> {
    User findFirstByUserEmail(String newEmail);

    User findByUserEmail(String email);

}
