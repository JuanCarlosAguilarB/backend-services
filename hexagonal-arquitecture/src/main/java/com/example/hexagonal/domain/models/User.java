package com.example.hexagonal.domain.models;

import lombok.*;

import java.time.LocalTime;
import java.util.UUID;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private UUID id;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private Boolean isVerified = false;
    private String phoneNumber;
    private LocalTime created;
    private LocalTime lastLogin;

    // field used in logout
    private Boolean wasLogged = false;

}
