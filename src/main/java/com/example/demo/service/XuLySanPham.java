package com.example.demo.service;

import com.example.demo.dto.request.ProductRequest;

import java.util.List;

public interface XuLySanPham {

   public void themsp(ProductRequest addproductRequest);

   public void xoaSP(String name);

   public List<ProductRequest> getProducts();

   public ProductRequest getProductRequest(String name);

   public List<ProductRequest> getProductRequestbyname( String name );


}
