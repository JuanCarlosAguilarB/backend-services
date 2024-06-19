package com.example.hexagonal.infrastructure.ports.out;

import com.example.hexagonal.domain.models.User;
import com.example.hexagonal.infrastructure.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserJpaRepository extends CrudRepository<UserEntity, UUID> {

    /**
     * Checks if a user exists with the given email.
     *
     * @param email The email address of the user.
     * @return True if a user exists with the given email, false otherwise.
     */
    public boolean existsByEmail(String email);

    /**
     * Checks if a user exists with the given username.
     *
     * @param username The username of the user.
     * @return True if a user exists with the given username, false otherwise.
     */
    public boolean existsByUsername(String username);

    /**
     * Retrieves a user by their username.
     *
     * @param username The username of the user.
     * @return The user with the specified username, or null if not found.
     */
    public User findByUsername(String username);

    /**
     * Retrieves a user by their email address.
     *
     * @param email The email address of the user.
     * @return The user with the specified email address, or null if not found.
     */
    public User findByEmail(String email);

}
