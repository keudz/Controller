package com.example.demo.service;

import com.example.demo.dto.request.ChanTk;
import com.example.demo.dto.request.TPQuanTriVien;

import java.util.List;

public interface QuanTriVien {
    public List<TPQuanTriVien> getAll();
    public TPQuanTriVien block (ChanTk chanTk );
    public String Add (TPQuanTriVien add);
}
