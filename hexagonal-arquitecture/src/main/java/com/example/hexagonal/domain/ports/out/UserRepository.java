package com.example.hexagonal.domain.ports.out;


import com.example.hexagonal.domain.models.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository {

    public void delete(UUID id);
    public User save(User user);
    public Optional<User> getUserById(UUID id);
    public Optional<User> updateUser(User user);

}
