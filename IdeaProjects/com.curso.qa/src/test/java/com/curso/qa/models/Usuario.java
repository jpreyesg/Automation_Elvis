package com.curso.qa.models;

public class Usuario {

    private String username;
    private String email;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    public String getWrongPassword(){
        return "12345";

    }
}
