package com.example.demo.service.implement;

import com.example.demo.dto.request.ThanhPhanEmail;
import com.example.demo.dto.request.response.ThanhPhanNhayCam;
import com.example.demo.service.DangkyTaiKhoan;
import com.example.demo.service.ValidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//tạo bean bằng annotation
@Service
public class DangKyTaiKhoanImpl implements DangkyTaiKhoan {

    @Autowired
    private ValidService validService;

    public static List <ThanhPhanEmail> danhSachEmail = new ArrayList<>(List.of(new ThanhPhanEmail("@12345678", "12345678"),new ThanhPhanEmail("@2345678","sdfdsfsfsdf")));


//    @Override
//    public  ThanhPhanEmail adduser (ThanhPhanEmail thanhPhanEmail){
//        ThanhPhanEmail user = new ThanhPhanEmail(thanhPhanEmail.getEmail(),thanhPhanEmail.getPassword());
//        danhSachEmail.add(user);
//        return null;
//    }
    @Override
    public String dangKy(ThanhPhanEmail thanhPhan){
      String error = validService.validRequstDangKy(thanhPhan);
      if(error != null ){
          return error;
      }
       danhSachEmail.add(thanhPhan);
//      danhSachEmail.equals()
      return "bạn đã đăng ký thành công";
    }
   @Override
    public List<ThanhPhanEmail> showaccount (){
       return danhSachEmail;
    }

}
