package com.example.demo.controller;

import com.example.demo.constant.Urlconstant;
import com.example.demo.dto.request.response.UserCreateResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController_requestparam {
    @GetMapping(Urlconstant.API_V1_GET_USER)
        public Object getUser(@RequestParam(value = "name") String name,@RequestParam(value = "username") String username ){
        UserCreateResponseDto UserResponse = new UserCreateResponseDto();
        UserResponse.setName("nguyen van " + name);
        UserResponse.setUsername(username);
        return UserResponse;
    }


}
