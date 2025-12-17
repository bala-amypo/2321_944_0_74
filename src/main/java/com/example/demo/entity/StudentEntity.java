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
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    
}