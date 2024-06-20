package com.example.hexagonal.domain.ports.in;

import com.example.hexagonal.domain.models.User;

import java.util.UUID;

public interface SecurityPort {

    String encodePassword(String password);

    boolean isPasswordMatch(String rawPassword, String encodedPassword);

}
