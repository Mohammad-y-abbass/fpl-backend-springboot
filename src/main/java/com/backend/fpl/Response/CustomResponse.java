package com.backend.fpl.Response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomResponse {

private String message;
private int statusCode;
}
