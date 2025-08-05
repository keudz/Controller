package com.example.demo.dto.request;

public class UserLoginRequestDTO {
    private String email;

    private String password;

    private String error;

    public UserLoginRequestDTO(String email, String password, String error) {
        this.email = email;
        this.password = password;
        this.error = error;

    }

    public UserLoginRequestDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
