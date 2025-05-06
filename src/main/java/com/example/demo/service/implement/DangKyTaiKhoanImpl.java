package com.example.demo.service.implement;

import com.example.demo.dto.request.ThanhPhanEmail;
import com.example.demo.dto.request.response.ThanhPhanNhayCam;
import com.example.demo.service.DangkyTaiKhoan;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DangKyTaiKhoanImpl implements DangkyTaiKhoan {

    public static Map<String, String> danhsach = new HashMap<>();

    public void create (ThanhPhanEmail thanhPhan){
    danhsach.put(thanhPhan.getEmail(), thanhPhan.getPassword());
    }
    @Override
    public String dangKy(ThanhPhanEmail thanhPhan){
        ThanhPhanNhayCam thanhPhan1 = new ThanhPhanNhayCam();
        thanhPhan1.setEmail(thanhPhan.getEmail());
        return  "đăng ký tài khoản thành công --->>>";
    }

}
