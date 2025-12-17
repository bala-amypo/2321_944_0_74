package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
@RestController
@RequestMapping("/files")
public class NewFileController {

    @Autowired
    private NewFileService service;

    @GetMapping
    public List<NewFileEntity> getAll() {
        return service.getAll();
    }

    @PostMapping
    public NewFileEntity save(@RequestBody NewFileEntity file) {
        return service.save(file);
    }

    @PutMapping("/{id}")
    public NewFileEntity update(
            @PathVariable Long id,
            @RequestBody NewFileEntity file) {
        return service.update(id, file);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
