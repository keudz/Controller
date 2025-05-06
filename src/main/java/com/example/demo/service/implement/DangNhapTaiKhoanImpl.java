package com.example.demo.service.implement;

import com.example.demo.dto.request.ThanhPhanEmail;
import com.example.demo.service.DangNhapTaiKhoan;
import org.springframework.stereotype.Service;

@Service
public class DangNhapTaiKhoanImpl implements DangNhapTaiKhoan {



    @Override
    public Object dangNhap( ThanhPhanEmail thanhPhan) {
        String email = thanhPhan.getEmail();
        String password = thanhPhan.getPassword();


        if (DangKyTaiKhoanImpl.danhsach.containsKey(email)) {

            if (DangKyTaiKhoanImpl.danhsach.get(email).equals(password)) {
                return "Đăng nhập thành công!";
            } else {
                return "Mật khẩu sai!";
            }
        } else {
            return "Email chưa được đăng ký!";
        }
    }
}