package com.example.demo.dto.request;

public class ProductRequest {
    private String name;
    private int id;
    private String Loai;
    private String mieuta;
    private double gia;

    public ProductRequest(String name, int id, String loai, String mieuta, double gia) {
        this.name = name;
        this.id = id;
        Loai = loai;
        this.mieuta = mieuta;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String loai) {
        Loai = loai;
    }

    public String getMieuta() {
        return mieuta;
    }

    public void setMieuta(String mieuta) {
        this.mieuta = mieuta;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
}
