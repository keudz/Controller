package com.example.demo.service;

import com.example.demo.dto.request.UserCreateRequestDTO;
import com.example.demo.dto.request.UserLoginRequestDTO;

public interface UserValidateSevice {
    String ValidateCheckLogin(UserLoginRequestDTO user);

    String ValidateCheckCreate(UserCreateRequestDTO user);
}
