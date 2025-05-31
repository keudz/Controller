package com.example.demo.controller;

import com.example.demo.Config.AppConfig;
import com.example.demo.constant.Urlconstant1;
import com.example.demo.dto.request.ChanTk;
import com.example.demo.dto.request.ProductRequest;
import com.example.demo.dto.request.TPQuanTriVien;
import com.example.demo.dto.request.ThanhPhanEmail;
import com.example.demo.service.*;
import com.example.demo.service.implement.DangNhapTaiKhoanImpl;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.*;
import java.util.List;
//injection bằng field
@RestController
public class Controller {
    @Autowired
    public DangkyTaiKhoan dangkyTaiKhoan;

    @PostMapping(Urlconstant1.API_CREATE_ACCOUNT)
    public Object createAccount(@RequestBody ThanhPhanEmail thanhPhan) {
        return dangkyTaiKhoan.dangKy(thanhPhan);
    }

    //injection bằng constructor
    @RestController
    public class Controllerdn {
        private final DangNhapTaiKhoan dangNhapTaiKhoan;

        @Autowired
        public Controllerdn(DangNhapTaiKhoan dangNhapTaiKhoan) {
            this.dangNhapTaiKhoan = dangNhapTaiKhoan;
        }

        @PostMapping(Urlconstant1.API_LOG_IN)
        public Object dangnhap(@RequestBody ThanhPhanEmail thanhPhan) {

            return dangNhapTaiKhoan.dangNhap(thanhPhan);
        }

    }

    //injection bằng setter
    @RestController
    public class Controllerxemsp {
        private XuLySanPham showsp;

        @Autowired
        public void setshowsp(XuLySanPham showsp) {
            this.showsp = showsp;
        }

        @GetMapping(Urlconstant1.API_SHOW_PRODUCTS)
        public List<ProductRequest> showproducts() {
            return showsp.getProducts();
        }

    }


    @RestController
    public class ControllerxoaSP {
        @Autowired
        public XuLySanPham XoaSP;

        @DeleteMapping(Urlconstant1.API_DELETE_PRODUCT)
        public String deleteSP(@RequestParam String name) {
            XoaSP.xoaSP(name);
            return "Đã xoá thành công";
        }
    }

    @RestController
    public class Controlleradd {
        @Autowired
        public XuLySanPham add;

        @PostMapping(Urlconstant1.API_ADD_PRODUCT)
        public String add1(@RequestBody ProductRequest productRequest) {
            add.themsp(productRequest);
            return "ĐÃ THÊM THÀNH CÔNG";
        }
    }

    @RestController
    public class Controllerblock {
        @Autowired
        public QuanTriVien block;

        @PutMapping(Urlconstant1.API_BLOCK_URSE)
        public TPQuanTriVien Block(@RequestBody ChanTk chanTk) {
            return block.block(chanTk);
        }
    }

    @RestController
    public class Controlleradduser {
        @Autowired
        public QuanTriVien adduser;

        @PostMapping(Urlconstant1.API_ADD_USER)
        public String AddUser(TPQuanTriVien user) {
            return adduser.Add(user);
        }
    }


    @RestController
    public class Controllershow {
        @Autowired
        public QuanTriVien show;

        @GetMapping(Urlconstant1.API_SHOW_USER)
        public List<TPQuanTriVien> showuser() {
            return show.getAll();
        }
    }

    @RestController
    public class Controllergetbyname {
        @Autowired
        public XuLySanPham getsp;

        @PostMapping(Urlconstant1.API_GET_PRODUCT_BY_NAME)
        public List<ProductRequest> getspbyloai(@RequestParam String loai) {
            return getsp.getProductRequestbyloai(loai);
        }
    }


    @RestController
    public class showaccount {
        @Autowired
        public DangkyTaiKhoan dangkyTaiKhoan;
        @Autowired
        public ValidService validService;

        @GetMapping(Urlconstant1.API_SHOW_ACCOUNT)
        public List<ThanhPhanEmail> showaccount() {
            return dangkyTaiKhoan.showaccount();
        }@GetMapping(Urlconstant1.API_PREVIEW_PRODUCT)
        public ThanhPhanEmail xemtaikhoan (){
            return validService.xemtaikhoan();
        }
    }
}

