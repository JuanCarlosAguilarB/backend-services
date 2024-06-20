package com.example.hexagonal.appication;

import com.example.hexagonal.domain.models.UserCreatedRequest;
import com.example.hexagonal.domain.models.User;
import com.example.hexagonal.domain.models.UserResponse;
import com.example.hexagonal.domain.ports.in.SecurityPort;
import com.example.hexagonal.domain.ports.in.UserPort;
import com.example.hexagonal.domain.ports.out.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserUseCase implements UserPort {

    private final UserRepository userRepository;
    private final SecurityPort securityPort;

    public UserUseCase(UserRepository userRepository, SecurityPort securityPort) {
        this.userRepository = userRepository;
        this.securityPort = securityPort;
    }

    @Override
    public void create(UserCreatedRequest user) {

        User userToCreate = User.builder()
                .id(user.getId())
                .username(user.getUsername())
                .password(securityPort.encodePassword(user.getPassword()))
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .isVerified(false)
                .phoneNumber(user.getPhoneNumber())
                .created(LocalTime.now())
                .wasLogged(false)
                .build();

        User savedUser = userRepository.save(userToCreate);

    }

    @Override
    public Optional<UserResponse> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public UserResponse update(User user) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }

    @Override
    public List<UserResponse> findAll() {
        return List.of();
    }


}
