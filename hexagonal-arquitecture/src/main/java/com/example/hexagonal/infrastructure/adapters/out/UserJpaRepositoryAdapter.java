package com.example.hexagonal.infrastructure.adapters.out;

import com.example.hexagonal.domain.models.User;
import com.example.hexagonal.domain.ports.out.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public class UserJpaRepositoryAdapter implements UserRepository {
    @Override
    public void delete(Long id) {

    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public Optional<User> getUserById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> updateUser(User user) {
        return Optional.empty();
    }
}
