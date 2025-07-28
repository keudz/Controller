package com.example.demo.dto.request;

public class UserCreateRequestDTO {
    private String email;
    private String password;
    private String fullname;
    private String error;


    public UserCreateRequestDTO(String email, String password, String fullname, String error) {
        this.email = email;
        this.password = password;
        this.fullname = fullname;
        this.error = error;

}
    public UserCreateRequestDTO() {}

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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
