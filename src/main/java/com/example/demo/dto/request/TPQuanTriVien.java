package com.example.demo.dto.request;

public class TPQuanTriVien {
    private String fullname;
    private String password;
    private  String status;
    private String email;
    private String role;
    private int id;

    public TPQuanTriVien(String fullname, String password, String status, String email, String role, int id) {
        this.fullname = fullname;
        this.password = password;
        this.status = status;
        this.email = email;
        this.role = role;
        this.id = id;
     }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
