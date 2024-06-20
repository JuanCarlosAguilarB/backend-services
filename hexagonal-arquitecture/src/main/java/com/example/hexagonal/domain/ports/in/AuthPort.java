package com.example.hexagonal.domain.ports.in;

import com.example.hexagonal.domain.models.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AuthPort {

    public Auth create(AuthRequest authRequest);
    public void delete(UUID userId);

}
