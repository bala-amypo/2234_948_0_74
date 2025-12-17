package com.example.demo.exception.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.MethodArgumentNotValidException;
import java.uti.*;


@RestControllerAdvice
public class globalExceptionHandler {

    @ExceptionHandler (MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleFieldError(MethodArgumentNotValidException.ex)
    Map<String,string> error = new HasgMap<>();

    ex.getBindingData().getFieldsError().forEach( err -> error.put(ex.getField(), ex.getDefaultMessage()))
}