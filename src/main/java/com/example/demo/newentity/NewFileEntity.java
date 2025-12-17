package com.example.demo.newentity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

public class NewFileEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "should not contain spaces")
    private String name;
    @column(name=unique)
    @NotBlank(message = "no blank allowed")
    @Email(message = "invalid format")
    private String email;
} 