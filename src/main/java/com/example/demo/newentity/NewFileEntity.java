package com.example.demo.entity;

import java.time.LocalDate;


public class StudentEntity {
    private String name;
    @id
    private Long id;
    @column(name=unique)
    private String email;
    private String password;
    private String role;
    public StudentEntity(String name, int id, LocalDate dob, String email, float cgpa) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
        this.role=role;
    }

    public StudentEntity(){

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}