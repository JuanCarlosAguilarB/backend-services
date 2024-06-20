package com.example.hexagonal.domain.ports.in;

import com.example.hexagonal.domain.models.UserCreatedRequest;
import com.example.hexagonal.domain.models.User;
import com.example.hexagonal.domain.models.UserResponse;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserPort {

    public void create(UserCreatedRequest user);
    public Optional<UserResponse> findById(UUID id);
    public UserResponse update(User user);
    public void deleteById(UUID id);
    public List<UserResponse> findAll();
}
