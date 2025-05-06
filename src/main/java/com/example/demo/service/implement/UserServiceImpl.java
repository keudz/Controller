package com.example.demo.service.implement;

import com.example.demo.dto.request.UserCreateRequestDto;
import com.example.demo.dto.request.response.UserCreateResponseDto;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserCreateResponseDto createUser(UserCreateRequestDto req){
        UserCreateResponseDto userRes  = new UserCreateResponseDto();
        userRes.setName(req.getName());
        userRes.setUsername(req.getUsername());
        return userRes;
    }
}
