package com.example.demo.service.implement;

import com.example.demo.dto.request.ThanhPhanEmail;
import com.example.demo.service.DangNhapTaiKhoan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//sử dụng @Configuration và @Bean
public class DangNhapTaiKhoanImpl implements DangNhapTaiKhoan {

    @Autowired
    private ValidServiceImpl validService;

    @Override
    public String dangNhap( ThanhPhanEmail thanhPhan) {

        return validService.validRequstDangNhap(thanhPhan);
    }
}