package com.bytes.accounts.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomerAlreadyExistsExceptions extends RuntimeException{

    public CustomerAlreadyExistsExceptions(String message) {
        super(message);
    }

    public CustomerAlreadyExistsExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
