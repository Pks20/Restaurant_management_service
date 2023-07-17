package com.Restaurant_management_service.Restaurant_management_service.controller;

import com.Restaurant_management_service.Restaurant_management_service.model.User;
import com.Restaurant_management_service.Restaurant_management_service.model.dto.SignInInput;
import com.Restaurant_management_service.Restaurant_management_service.model.dto.SignUpOutput;
import com.Restaurant_management_service.Restaurant_management_service.service.AuthenticationService;
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
    @Autowired
    AuthenticationService authenticationService;
    @PostMapping("user/signup")
    public SignUpOutput signUpUser(@RequestBody User user)
    {

        return userService.signUpUser(user);
    }

    @PostMapping("user/signIn")
    public String sigInUser(@RequestBody @Valid SignInInput signInInput)
    {
        return userService.signInUser(signInInput);
    }

    @DeleteMapping("user/signOut")
    public String sigOutUser(String email, String token)
    {
        if(authenticationService.authenticate(email,token)) {
            return userService.sigOutUser(email);
        }
        else {
            return "Sign out not allowed for non authenticated user.";
        }

    }


}
