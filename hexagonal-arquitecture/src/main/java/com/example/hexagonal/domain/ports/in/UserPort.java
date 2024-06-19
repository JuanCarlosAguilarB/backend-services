package com.example.hexagonal.domain.ports.in;

import com.example.hexagonal.domain.models.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserPort {

    public User create(User user);
    public Optional<User> findById(UUID id);
    public User update(User user);
    public void deleteById(UUID id);
    public List<User> findAll();
}
