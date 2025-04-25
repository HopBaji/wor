package com.example.solarv2.Service;

import com.example.solarv2.Reposit.UserRepository;
import com.example.solarv2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
@RequiredArgsConstructor

public class UserService {

    @Autowired
    private  UserRepository userRepository;


    @Autowired
    private PasswordEncoder passwordEncoder;



    public void registerUser(String username, String password) {
        if (userRepository.findByUsername(username).isPresent()) {
            throw new IllegalArgumentException("Username already exists");
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        userRepository.save(user);
    }
}

