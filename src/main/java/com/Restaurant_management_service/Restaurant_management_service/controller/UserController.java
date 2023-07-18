package com.Restaurant_management_service.Restaurant_management_service.controller;

import com.Restaurant_management_service.Restaurant_management_service.model.User;
import com.Restaurant_management_service.Restaurant_management_service.model.dto.SignInInput;
import com.Restaurant_management_service.Restaurant_management_service.model.dto.SignUpOutput;
import com.Restaurant_management_service.Restaurant_management_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("user/signUp")
    public SignUpOutput signUpUser(@RequestBody @Valid User user)
    {

        return userService.signUpUser(user);
    }

    @PostMapping("user/signIn")
    public String sigInUser(@RequestBody @Valid SignInInput signInInput)
    {
        return userService.sigInUser(signInInput);
    }
    @GetMapping("users")
    List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @DeleteMapping("user/{Id}")
    public void deleteUser(@PathVariable Integer Id)
    {
        userService.deleteUser(Id);
    }


}
