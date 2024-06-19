package com.example.hexagonal.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.UUID;


@Entity
@Data
@Builder
@Table(name = "\"user\"")
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true)
    private String username;

    private String password;

    private String email;

    private String firstName;

    private String lastName;

    private Boolean isVerified = false;

    @Column(name = "phone_number")
    private String phoneNumber;

    private LocalTime created;

    @Column(name = "last_login")
    private LocalTime lastLogin;

    @Column(name = "was_logged")
    private Boolean wasLogged = false;

}
