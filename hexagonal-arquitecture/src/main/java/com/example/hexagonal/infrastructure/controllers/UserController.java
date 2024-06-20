package com.example.hexagonal.infrastructure.controllers;

import com.example.hexagonal.appication.UserUseCase;
import com.example.hexagonal.domain.models.UserCreatedRequest;
import com.example.hexagonal.domain.ports.in.UserPort;
import com.example.hexagonal.infrastructure.ResponseApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users/")
public class UserController {

    private final UserPort userUseCase;

    public UserController(UserUseCase userUseCase) {
        this.userUseCase = userUseCase;
    }

    @PostMapping
    public ResponseEntity<ResponseApi> createUser(@RequestBody UserCreatedRequest user) {

        userUseCase.create(user);

        ResponseApi response = ResponseApi.builder()
                .message("User Created")
                .statusCode(HttpStatus.CREATED.value())
                .build();

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
