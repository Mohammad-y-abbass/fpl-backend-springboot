package com.backend.fpl.Exceptions.user;

public class UserAlreadyExistException extends RuntimeException {

    public UserAlreadyExistException() {
        super("User Already Exists");
    }
}
