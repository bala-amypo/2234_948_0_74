package com.example.demo.exception.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.MethodArgumentNotValidException;
import java.util.*;
import org.springframework.http.ResponseEntity;


@RestControllerAdvice
public class globalExceptionHandler {

    @ExceptionHandler (MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleFieldError(MethodArgumentNotValidException.ex)
       Map<String,string> error = new HasgMap<>();

    ex.getBindingResult().getFieldsError().forEach( err -> error.put(ex.getField(), ex.getDefaultMessage()));

    return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
}