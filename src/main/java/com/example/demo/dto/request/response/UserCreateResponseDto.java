package com.example.demo.dto.request.response;

public class UserCreateResponseDto {
    private String username;


    private String name;

    public UserCreateResponseDto() {}

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}


