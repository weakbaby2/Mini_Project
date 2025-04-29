package com.example.demo.project.execption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class AlreadyExistsException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public AlreadyExistsException(String message) {
        super(message);
    }
}
