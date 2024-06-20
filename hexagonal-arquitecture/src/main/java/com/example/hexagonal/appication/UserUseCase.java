package com.example.hexagonal.appication;

import com.example.hexagonal.domain.models.User;
import com.example.hexagonal.domain.ports.in.UserPort;
import com.example.hexagonal.domain.ports.out.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserUseCase implements UserPort {

    private final UserRepository userRepository;

    public UserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public Optional<User> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }

    @Override
    public List<User> findAll() {
        return List.of();
    }
}
