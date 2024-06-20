package com.example.hexagonal.appication;

import com.example.hexagonal.domain.models.*;
import com.example.hexagonal.domain.ports.in.AuthPort;
import com.example.hexagonal.domain.ports.out.AuthRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AuthUseCase implements AuthPort {


    private final AuthRepository authRepository;

    public AuthUseCase(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    @Override
    public Auth create(AuthRequest authRequest) {
        return null;
    }

    @Override
    public void delete(UUID userId) {

    }

    @Override
    public void validateToken(String token) {

        if (token == null || token.isEmpty()) {
            throw new IllegalArgumentException("Token is required");
        }

        if (!authRepository.isValid(token)) {
            throw new IllegalArgumentException("Invalid token");
        }
    }
}
