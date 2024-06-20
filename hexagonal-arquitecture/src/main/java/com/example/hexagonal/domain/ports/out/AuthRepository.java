package com.example.hexagonal.domain.ports.out;


import com.example.hexagonal.domain.models.Auth;
import com.example.hexagonal.domain.models.User;

import java.util.Optional;
import java.util.UUID;

public interface AuthRepository {

    public void delete(UUID id);
    public Auth create(User user);
    public Boolean isValid(String token);
}
