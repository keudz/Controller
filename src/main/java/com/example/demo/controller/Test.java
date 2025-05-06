package com.example.demo.controller;

import com.example.demo.constant.Urlconstant;
import com.example.demo.dto.request.UserCreateRequestDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Test {
    public UserService userService;
    @PostMapping(Urlconstant.API_V1_CREATE_USER)
    public Object createUser(@RequestBody UserCreateRequestDto req){
        return userService.createUser(req);
    }

}
