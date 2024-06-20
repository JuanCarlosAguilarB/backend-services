package com.example.hexagonal.mapper;

import com.example.hexagonal.domain.models.User;
import com.example.hexagonal.infrastructure.entities.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public User toDomain(UserEntity userEntity) {
        return User.builder()
                .id(userEntity.getId())
                .username(userEntity.getUsername())
                .password(userEntity.getPassword())
                .email(userEntity.getEmail())
                .firstName(userEntity.getFirstName())
                .lastName(userEntity.getLastName())
                .isVerified(userEntity.getIsVerified())
                .phoneNumber(userEntity.getPhoneNumber())
                .created(userEntity.getCreated())
                .lastLogin(userEntity.getLastLogin())
                .wasLogged(userEntity.getWasLogged())
                .build();
    }


    public UserEntity toEntity(User user) {
        return UserEntity.builder()
                .id(user.getId())
                .username(user.getUsername())
                .password(user.getPassword())
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .isVerified(user.getIsVerified())
                .phoneNumber(user.getPhoneNumber())
                .created(user.getCreated())
                .lastLogin(user.getLastLogin())
                .wasLogged(user.getWasLogged())
                .build();
    }

}