package com.example.demo.Config;

import com.example.demo.service.DangNhapTaiKhoan;
import com.example.demo.service.implement.DangNhapTaiKhoanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DangNhapTaiKhoanImpl dangNhapTaiKhoan() {
        return new DangNhapTaiKhoanImpl();
    }
}
