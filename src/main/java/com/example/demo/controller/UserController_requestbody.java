package com.example.demo.controller;

import com.example.demo.constant.Urlconstant;
import com.example.demo.dto.request.UserCreateRequestDto;
import com.example.demo.dto.request.response.UserCreateResponseDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController_requestbody {
    @PostMapping(Urlconstant.API_V1_CREATE_USER)
    public Object CreateUser(@RequestBody UserCreateRequestDto request ){
        UserCreateResponseDto UserResponse = new UserCreateResponseDto();
        UserResponse.setName(request.getName());
        UserResponse.setUsername(request.getUsername());
        return UserResponse;
    }

}
