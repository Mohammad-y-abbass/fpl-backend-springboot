package com.backend.fpl.Services.Impl;

import com.backend.fpl.Services.IUserServices;
import com.backend.fpl.Dtos.UserRegisterationDto;
import com.backend.fpl.Exceptions.user.UserAlreadyExistException;
import com.backend.fpl.Models.User;
import com.backend.fpl.Repositories.IUserRepository;
import org.springframework.stereotype.Service;

import org.springframework.security.crypto.password.PasswordEncoder;

@Service
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

        if (userRepository.existsByUsername(registerationDto.getUsername())) {
            throw new UserAlreadyExistException();
        }

        if( userRepository.existsByEmail(registerationDto.getEmail())) {
            throw new UserAlreadyExistException();
        }

        user.setUsername(registerationDto.getUsername());
        user.setEmail(registerationDto.getEmail());
        user.setPassword(passwordEncoder.encode(registerationDto.getPassword()));
       
        return userRepository.save(user);
    }

}
