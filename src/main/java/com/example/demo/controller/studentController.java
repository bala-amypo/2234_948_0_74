package com.example.demo.controller;


import com.example.demo.entity.studentEntity;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.*;

import com.example.demo.entity.*;
import com.example.demo.service.studentService;


@RestController
public class studentController {

    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public List<studentEntity> getAll(){
        return service.getAll();
    }
    @PostMapping("/add")
    public studentEntity addStudent(@Valid @RequestBody studentEntity student) {
        return service.addStudent(student);
    }

    @GetMapping("/get/{id}")
    public studentEntity getStudentById(@PathVariable Long Id){
        return service.getById(id);
    }

    @PutMapping("/update/{id}")
    public String updateStatus(
    @Pathvariable Long id,
    @RequestBody studentEntity student){
        return sevice.updateStudent(id, student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
    return service.deleteStudent(id);
    }

}