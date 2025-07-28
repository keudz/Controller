package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.entity.User;

import java.util.List;

public interface AdminService {
  List<User> showAllUser();

  User blockUser(int id);

  Product addProduct(Product product  );

  Product updateProduct(int id,String Attribute,String information);

    Product deleteProduct(int id);

    List<Product> showAllProduct();
}

