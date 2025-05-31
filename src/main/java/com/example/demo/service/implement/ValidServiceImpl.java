package com.example.demo.service.implement;

import com.example.demo.dto.request.ThanhPhanEmail;
import com.example.demo.service.DangkyTaiKhoan;
import com.example.demo.service.ValidService;
import com.example.demo.service.XuLySanPham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidServiceImpl  implements ValidService {

   public boolean equals(Object obj){
       if(this == obj)
           return true;
       return false;
   }
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
       ThanhPhanEmail user = new ThanhPhanEmail("@12345678", "12345678");
        if( true){
            if( equals(user) ==  equals(thanhPhan))
                return "dang nhap thanh cong";
            else
                 return "mat khau or tai khoan sai";
        }
        else
        return "tai khoan chua dang ky";
    }

    @Override
    public ThanhPhanEmail xemtaikhoan (){
       return DangKyTaiKhoanImpl.danhSachEmail.get(1);
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
