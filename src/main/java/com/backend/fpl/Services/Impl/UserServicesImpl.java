package com.backend.fpl.Services.Impl;

import com.backend.fpl.Services.IUserServices;
import com.backend.fpl.Dtos.UserRegisterationDto;
import com.backend.fpl.Models.User;
import com.backend.fpl.Repositories.IUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserServicesImpl implements IUserServices {

    private final IUserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServicesImpl(IUserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User registerUser(UserRegisterationDto registerationDto) {
        User user = new User();
        user.setUsername(registerationDto.getUsername());
        user.setEmail(registerationDto.getEmail());
        user.setPassword(passwordEncoder.encode(registerationDto.getPassword()));
       
        return userRepository.save(user);
    }

}
