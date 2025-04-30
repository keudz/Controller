package com.example.demo.controller;

import com.example.demo.constant.Urlconstant;
import com.example.demo.dto.request.response.UserCreateResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class GetDetai {
    @GetMapping(Urlconstant.API_V1_GET_DETAIL_USER)
    public Object getDetailUser (@PathVariable("id") String id){
        if(Objects.equals("1",id)){
            UserCreateResponseDto UserResponse = new UserCreateResponseDto();
            UserResponse.setName("nguyen van 1");
            UserResponse.setUsername("nguyenvan 1");
            return UserResponse;
        }
        return "cdb";
    }

}
