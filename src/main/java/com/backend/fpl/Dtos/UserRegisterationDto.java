package com.backend.fpl.Dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRegisterationDto {

    @NotBlank(message = "Username cannot be empty")
    private String username;
    @Email(message = "Invalid email address")
    @NotBlank(message = "Email cannot be empty")
    private String email;
    @NotBlank(message = "Password cannot be empty")
    private String password;

}
