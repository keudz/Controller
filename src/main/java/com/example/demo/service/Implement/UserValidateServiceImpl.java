package com.example.demo.service.Implement;

import com.example.demo.dto.request.UserCreateRequestDTO;
import com.example.demo.dto.request.UserLoginRequestDTO;
import com.example.demo.service.UserValidateSevice;
import org.springframework.stereotype.Service;

@Service
public class UserValidateServiceImpl implements UserValidateSevice {

    @Override
    public String ValidateCheckLogin(UserLoginRequestDTO user) {
        if (user.getEmail() == null || user.getEmail().isEmpty() ||
                user.getPassword() == null || user.getPassword().isEmpty()) {
            return "Nhập thiếu thông tin rồi !!!";
        }

        if (user.getEmail().length() < 20) {
            return "Email của m nhập thiếu kí tự rồi !!!";
        }

        if (user.getPassword().length() < 8) {
            return "Mật khẩu của nhập thiếu kí tự rồi !!!";
        }

        return null;
    }

    @Override
    public String ValidateCheckCreate(UserCreateRequestDTO user) {
        if (user.getEmail() == null || user.getEmail().isEmpty() ||
                user.getFullname() == null || user.getFullname().isEmpty()||
                user.getPassword() == null || user.getPassword().isEmpty()) {
            return "Nhập thiếu thông tin rồi !!!";
        }

        if (user.getEmail().length() < 20) {
            return "Email của m nhập thiếu kí tự rồi !!!";
        }

        if (user.getPassword().length() < 8) {
            return "Mật khẩu của nhập thiếu kí tự rồi !!!";
        }

        return null;
    }


}
