package com.example.demo.service;

import com.example.demo.dto.request.ThanhPhanEmail;

import java.util.List;

public interface DangkyTaiKhoan {
     String dangKy(ThanhPhanEmail thanhPhan);
//     public ThanhPhanEmail adduser (ThanhPhanEmail thanhPhanEmail);
     public  List<ThanhPhanEmail> showaccount ();
}
