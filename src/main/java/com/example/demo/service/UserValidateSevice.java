package com.example.demo.service;

import com.example.demo.dto.request.UserCreateRequestDTO;
import com.example.demo.dto.response.UserCreateResonseDTO;

public interface UserValidateSevice {
    String ValidateCheckLogin(UserCreateRequestDTO user);
}
