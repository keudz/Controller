package com.example.demo.service;

import com.example.demo.dto.request.UserCreateRequestDTO;
import com.example.demo.dto.response.UserCreateResonseDTO;
import com.example.demo.entity.Product;
import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    String login(UserCreateResonseDTO user);

    UserCreateResonseDTO createUser (UserCreateRequestDTO user);

    User getUserById(int id);

    List<Product> showallproduct();

    Object addProduct(String email,String nameProduct,int quantity);

    Object userCheckListProduct(String email);

    String userDeleteProduct(String email,String nameProduct);

}
