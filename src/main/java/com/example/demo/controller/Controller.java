package com.example.demo.controller;

import com.example.demo.constant.Urlconstant1;
import com.example.demo.dto.request.ChanTk;
import com.example.demo.dto.request.ProductRequest;
import com.example.demo.dto.request.TPQuanTriVien;
import com.example.demo.dto.request.ThanhPhanEmail;
import com.example.demo.service.DangNhapTaiKhoan;
import com.example.demo.service.DangkyTaiKhoan;
import com.example.demo.service.QuanTriVien;
import com.example.demo.service.XuLySanPham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    public DangkyTaiKhoan dangkyTaiKhoan;
    @PostMapping(Urlconstant1.API_CREATE_ACCOUNT)
    public Object createAccount(@RequestBody ThanhPhanEmail thanhPhan){
        return dangkyTaiKhoan.dangKy(thanhPhan);
    }

    @RestController
    public  class Controllerdn {
        @Autowired
        public DangNhapTaiKhoan dangnhaptaikhoan;
        @PostMapping(Urlconstant1.API_GET_ACCOUNT_BY_ID)
        public Object sdsdsd (@RequestBody ThanhPhanEmail thanhPhan){
            return dangnhaptaikhoan.dangNhap(thanhPhan);
        }

    }

    @RestController
    public class Controllerxemsp {
        @Autowired
        public XuLySanPham showsp;
        @GetMapping(Urlconstant1.API_SHOW_PRODUCTS)
        public List<ProductRequest> showproducts (){
            return showsp.getProducts();
        }
    }

    @RestController
    public class ControllerxoaSP {
        @Autowired
        public XuLySanPham XoaSP;
        @DeleteMapping(Urlconstant1.API_DELETE_PRODUCT)
        public String deleteSP (@RequestParam String name){
            XoaSP.xoaSP(name);
            return "Đã xoá thành công";
        }
    }
    @RestController
    public class Controlleradd{
        @Autowired
        public XuLySanPham add;
        @PostMapping(Urlconstant1.API_ADD_PRODUCT)
        public String add1 (@RequestBody ProductRequest productRequest ){
            add.themsp(productRequest);
            return "ĐÃ THÊM THÀNH CÔNG";
        }
    }
    @RestController
    public class Controllerblock{
        @Autowired
        public QuanTriVien block;
        @PutMapping(Urlconstant1.API_BLOCK_URSE)
        public TPQuanTriVien Block (@RequestBody ChanTk chanTk ){
            return  block.block(chanTk);
        }
    }

    @RestController
    public class Controllershow{
        @Autowired
        public QuanTriVien show;
        @GetMapping(Urlconstant1.API_SHOW_USER)
        public List<TPQuanTriVien> showuser (){
            return show.getAll();
        }
    }

    @RestController
    public class Controllergetbyname{
        @Autowired
        public XuLySanPham getsp;
        @PostMapping(Urlconstant1.API_GET_PRODUCT_BY_NAME)
        public List<ProductRequest> getspbyname (@RequestParam String name){
            return getsp.getProductRequestbyname(name);
        }
    }
}
