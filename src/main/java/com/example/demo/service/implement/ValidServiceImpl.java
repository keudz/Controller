package com.example.demo.service.implement;

import com.example.demo.dto.request.ThanhPhanEmail;
import com.example.demo.service.DangkyTaiKhoan;
import com.example.demo.service.ValidService;
import com.example.demo.service.XuLySanPham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidServiceImpl  implements ValidService {

   @Override
    public String validRequstDangKy(ThanhPhanEmail thanhPhan) {
        if(thanhPhan.getEmail().length() < 20)
           return "email khong du ki tu";
        if (thanhPhan.getPassword().length() < 20)
           return "mat khau khong du ki tu";
        return null;
    }
    @Override
    public String validRequstDangNhap(ThanhPhanEmail thanhPhan) {
        if(DangKyTaiKhoanImpl.danhSachEmail.contains(thanhPhan)){
            if(DuyetEmail(thanhPhan) == null)
                return "mat khau or tai khoan sai";
                return "dang nhap thanh cong";
        }
        return "tai khoan chua dang ky";
    }
    public ThanhPhanEmail DuyetEmail (ThanhPhanEmail thanhPhan){
       for(ThanhPhanEmail account : DangKyTaiKhoanImpl.danhSachEmail){
           if(account.equals(thanhPhan)){
               return account;
           }
       }
       return null;
    }
}
