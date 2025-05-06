package com.example.demo.dto.request.response;

public class ProductResponseDto {
    private String name;
    private String mieuta;
    private double gia;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
