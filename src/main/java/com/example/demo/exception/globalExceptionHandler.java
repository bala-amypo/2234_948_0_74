package com.example.demo.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;


@RestControllerAdvice
public class globalExceptionHandler {

    @ExceptionHandler (MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String> handleFieldError(MethodArgumentNotValidException ex){
    
       Map<String,string> error = new HashMap<>();

    ex.getBindingResult().getFieldsError().forEach( err -> error.put(ex.getField(), ex.getDefaultMessage()));

    return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
}