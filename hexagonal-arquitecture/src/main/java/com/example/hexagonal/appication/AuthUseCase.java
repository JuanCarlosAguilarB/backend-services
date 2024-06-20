package com.example.hexagonal.appication;

import com.example.hexagonal.domain.models.*;
import com.example.hexagonal.domain.ports.in.AuthPort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AuthUseCase implements AuthPort {


    @Override
    public Auth create(AuthRequest authRequest) {
        return null;
    }

    @Override
    public void delete(UUID userId) {

    }
}
