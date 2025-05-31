package com.example.demo.service;

import com.example.demo.dto.request.ThanhPhanEmail;

public interface ValidService {
    public String validRequstDangKy(ThanhPhanEmail thanhPhan);

    public String validRequstDangNhap(ThanhPhanEmail thanhPhan);

    public ThanhPhanEmail xemtaikhoan ();

}
