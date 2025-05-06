package com.example.demo.service.implement;

import com.example.demo.dto.request.ChanTk;
import com.example.demo.dto.request.ProductRequest;
import com.example.demo.dto.request.TPQuanTriVien;
import com.example.demo.service.QuanTriVien;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class QuanTriVienImpl implements QuanTriVien {
     TPQuanTriVien thanhvien1 = new TPQuanTriVien("nguyenthedat","123456789","active","1234@aewdwqe","user",001);
     TPQuanTriVien thanhvien2 = new TPQuanTriVien("nguyenthedat2","1234567892","active","1234@aewdwqe2","user",002);
     TPQuanTriVien thanhvien3 = new TPQuanTriVien("nguyenthedat3","1234567893","active","1234@aewdwqe3","user",003);

     List<TPQuanTriVien> listQuanTriVien =  new ArrayList< >(List.of(thanhvien1,thanhvien2,thanhvien3));

        @Override
        public List<TPQuanTriVien> getAll() {
            return listQuanTriVien;
        }

        @Override
        public TPQuanTriVien block(ChanTk chanTk) {
            TPQuanTriVien user = getUser(chanTk.getEmail());
            user.setStatus(chanTk.getStatus());
            user.setEmail(chanTk.getEmail());
            return user;
        }
    private TPQuanTriVien getUser ( String email) {
        for (TPQuanTriVien Urse : listQuanTriVien) {
            if (Urse.getEmail().equals(email))
                return  Urse;

        }
        return null;
    }
}







