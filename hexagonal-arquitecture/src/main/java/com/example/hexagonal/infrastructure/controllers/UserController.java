package com.example.hexagonal.infrastructure.controllers;

import com.example.hexagonal.appication.UserUseCase;
import com.example.hexagonal.domain.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/users/")
public class UserController {

    private final UserUseCase userUseCase;

    public UserController(UserUseCase userUseCase) {
        this.userUseCase = userUseCase;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User userCreated = userUseCase.create(user);
        return new ResponseEntity<>(userCreated, HttpStatus.CREATED);
    }

}
