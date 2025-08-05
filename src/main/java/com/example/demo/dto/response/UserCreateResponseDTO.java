package com.example.demo.dto.response;

public class UserCreateResponseDTO {
    private String email;
    private String Name;
    private String error;

    public UserCreateResponseDTO(String email, String Name, String error) {
        this.email = email;
        this.Name = Name;
        this.error = error;
    }

    public UserCreateResponseDTO() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
