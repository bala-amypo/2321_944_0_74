package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.newentity.NewFileEntity;
import com.example.demo.newservice.NewFileService;
@RestController
@RequestMapping("/students")
public class NewFileController {
    private final NewFileService service;
    public NewFileController(NewFileService service){
        this.service=service;
    }
    @PostMapping
    public ResponseEntity<Student> createStudent(@Valid @RequestBodyStudent  service){
        return new
    }