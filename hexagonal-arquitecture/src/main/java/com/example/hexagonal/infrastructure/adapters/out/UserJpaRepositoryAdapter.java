package com.example.hexagonal.infrastructure.adapters.out;

import com.example.hexagonal.domain.models.User;
import com.example.hexagonal.domain.ports.out.UserRepository;
import com.example.hexagonal.infrastructure.entities.UserEntity;
import com.example.hexagonal.infrastructure.ports.out.UserJpaRepository;
import com.example.hexagonal.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public class UserJpaRepositoryAdapter implements UserRepository {

    private final UserJpaRepository userJpaRepository;
    private final UserMapper userMapper;

    public UserJpaRepositoryAdapter(UserJpaRepository userJpaRepository, UserMapper userMapper) {
        this.userJpaRepository = userJpaRepository;
        this.userMapper = userMapper;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public User save(User user) {

        UserEntity userEntity = userMapper.toEntity(user);
        UserEntity userSaved = userJpaRepository.save(userEntity);

        return userMapper.toDomain(userSaved);
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
