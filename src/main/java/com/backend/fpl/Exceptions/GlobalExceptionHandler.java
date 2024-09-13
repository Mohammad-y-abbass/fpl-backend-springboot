package com.backend.fpl.Exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.backend.fpl.Exceptions.user.UserAlreadyExistException;
import com.backend.fpl.Response.CustomResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserAlreadyExistException.class)
    public ResponseEntity<CustomResponse> handleUserAlreadyExistException(UserAlreadyExistException ex) {
        CustomResponse response = new CustomResponse( "User already exists", 409);
        return ResponseEntity.status(409).body(response);
    }

}
