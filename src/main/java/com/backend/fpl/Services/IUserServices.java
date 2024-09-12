package com.backend.fpl.Services;

import com.backend.fpl.Dtos.UserRegisterationDto;
import com.backend.fpl.Models.User;

public interface IUserServices {

    User registerUser(UserRegisterationDto registerationDto);
}
