package com.example.hexagonal.infrastructure.adapters.in;

import com.example.hexagonal.domain.ports.in.SecurityPort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class SecurityAdapter implements SecurityPort {

    private final PasswordEncoder passwordEncoder;

    public SecurityAdapter(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }

    @Override
    public boolean isPasswordMatch(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }

}
