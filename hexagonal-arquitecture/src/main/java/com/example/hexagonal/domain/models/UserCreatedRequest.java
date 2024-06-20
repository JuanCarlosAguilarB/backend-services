package com.example.hexagonal.domain.models;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;


@Data
@Builder
public class UserCreatedRequest {

    private UUID id;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;

}