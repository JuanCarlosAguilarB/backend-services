package com.example.hexagonal.infrastructure.adapters.out;

import com.example.hexagonal.domain.models.Auth;
import com.example.hexagonal.domain.models.User;
import com.example.hexagonal.domain.ports.out.AuthRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class AuthRepositoryAdapter implements AuthRepository {

    @Override
    public void delete(UUID id) {

    }

    @Override
    public Auth create(User user) {
        return null;
    }

    @Override
    public Boolean isValid(String token) {
        return null;
    }
}
