package com.example.demo.newentity;
import jakarta.persistence.*
import jakarta.validation.constraints.*

public class NewFileEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "should not contain spaces")
    @column(unique=true)
    private String name;
    @column(name=unique)
    @NotBlank(message = "no blank allowed")
    @Email(message = "invalid format")
    private String email;
    public NewFileEntity(Long id, @NotBlank(message="should not contain spaces") String name,@NotBlank(message="no blank allowed") @Email(message="invalid format") String email) {
        this.id=id;
        this.name=name;
        this.email=email;
    }
    public NewFileEntity(){
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void  setEmail(String email){
        this.email=email;
    }
} 