package com.example.hexagonal.infrastructure.config;

import com.example.hexagonal.domain.models.User;
import com.example.hexagonal.domain.ports.out.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.web.servlet.HandlerExceptionResolver;

import java.util.Collections;

@Configuration
public class ConfigBeans {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }



    @Bean
    public UserDetailsService userDetailService() {
        return new UserDetailsService() {
            @Autowired
            private UserRepository userRepository;

            @Override
            public UserDetails loadUserByUsername(String email) throws RuntimeException {

                User user = userRepository.findByEmail(email);

                if (user == null) {
                    throw new RuntimeException("User not found");
                }

                return new org.springframework.security.core.userdetails.User(
                        user.getUsername(), user.getPassword(),
                        true, true, true, true, Collections.emptyList());
            }

        };

    }

    @Bean
    public AuthenticationProvider authenticationProvider()
    {
        DaoAuthenticationProvider authenticationProvider= new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailService());
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception
    {
        return config.getAuthenticationManager();
    }

}
