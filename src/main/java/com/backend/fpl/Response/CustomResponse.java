package com.backend.fpl.Response;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomResponse {

private String message;
private HttpStatus statusCode;
}
