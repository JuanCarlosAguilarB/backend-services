package com.example.hexagonal.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Auth {

    private String token;
    private String refreshToken;
    private UserResponse userResponse;

}
