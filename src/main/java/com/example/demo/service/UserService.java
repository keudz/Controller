package com.example.demo.service;

import com.example.demo.dto.request.UserCreateRequestDto;
import com.example.demo.dto.request.response.UserCreateResponseDto;

public interface UserService {

     UserCreateResponseDto createUser(UserCreateRequestDto request);


}
