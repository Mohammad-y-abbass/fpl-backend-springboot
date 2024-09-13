package com.backend.fpl.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.backend.fpl.Dtos.UserRegisterationDto;
import com.backend.fpl.Services.IUserServices;

@RestController
public class UserController {

    IUserServices userServices;

    public UserController(IUserServices userServices) {
        this.userServices = userServices;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserRegisterationDto registerationDto) {
      try {
        userServices.registerUser(registerationDto);
        return ResponseEntity.ok("User registered successfully");
    } catch (Exception e) {
        return ResponseEntity.badRequest().body("Failed to register user");
    }

}
}
