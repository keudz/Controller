package com.example.demo.controller;


import com.example.demo.constant.UrlConstant;
import com.example.demo.dto.request.UserCreateRequestDTO;
import com.example.demo.dto.request.UserLoginRequestDTO;
import com.example.demo.dto.response.UserCreateResponseDTO;
import com.example.demo.entity.Product;
import com.example.demo.entity.User;
import com.example.demo.service.AdminService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


public class UserController {
      @Autowired
      private UserService userSevice;
    @PostMapping(UrlConstant.API_V1_CREATE_USER)
    public Object CreateUser(@RequestBody UserCreateRequestDTO user) {
      return  userSevice.createUser(user);
    }

    @Autowired
    private UserService userLoginAcount;
    @PostMapping(UrlConstant.API_V1_LOGIN_USERS)
    public Object LoginUser(@RequestBody UserLoginRequestDTO user) {
        return userLoginAcount.login(user);
    }


    @Autowired
    private UserService getUser;
    @GetMapping(UrlConstant.API_V1_GET_USER)
    public UserCreateResponseDTO GetUser(@RequestParam int id) {
       return getUser.getUserById(id);
    }

    @Autowired
    private UserService showProduct;
    @GetMapping(UrlConstant.API_V1_SHOW_ALL_PRODUCT)
    public List<Product> GetAllProduct() {
        return showProduct.showallproduct();
    }

    @Autowired
    private AdminService blockUser;
    @PostMapping(UrlConstant.API_V1_BLOCK_USER)
    public Object BlockUser(@RequestParam int id) {
        return  blockUser.blockUser(id);
    }

    @Autowired
    private AdminService addProduct;
    @PostMapping(UrlConstant.API_V1_ADD_PRODUCT)
    public Object AddProduct(@RequestBody Product product) {
        return addProduct.addProduct(product);
    }

    @Autowired
    private AdminService updateProduct;
    @PatchMapping(UrlConstant.API_V1_UPDATE_PRODUCT)
    public Object AddProduct(@RequestParam int id, @RequestParam String Attribute,@RequestParam String Information) {
        return updateProduct.updateProduct(id, Attribute, Information);
    }

    @Autowired
    private AdminService deleteProduct;
    @DeleteMapping(UrlConstant.API_V1_DELETE_PRODUCT)
    public Object DeleteProduct(@RequestParam int id) {
        return deleteProduct.deleteProduct(id);
    }
     @Autowired
     private AdminService showProductAdmin;
     @GetMapping(UrlConstant.API_V1_SHOW_ALL_PRODUCT1)
     public List<Product> showAllProduct() {
         return showProductAdmin.showAllProduct();
     }

     @Autowired
    private UserService addPtoductToCart;
     @GetMapping(UrlConstant.ADD_PRODUCT_TO_CART)
     public Object AddProductToCart(@RequestParam UserLoginRequestDTO user,@RequestParam String nameProduct,@RequestParam int quantity) {
         return addPtoductToCart.addProduct(user,nameProduct,quantity);
     }

     @Autowired
     private UserService userCheckListProduct;
     @GetMapping(UrlConstant.USER_CHECK_LIST_PRODUCT)
    public Object userCheckListProduct(@RequestParam String email) {
         return  userCheckListProduct.userCheckListProduct(email);
     }

     @Autowired
     private UserService userDeleteProduct;
     @DeleteMapping(UrlConstant.USER_DELETE_PRODUCT_BY_NAME)
    public Object DeleteProductById(@RequestParam UserLoginRequestDTO user, String nameProduct) {
         return userDeleteProduct.userDeleteProduct(user,nameProduct);
     }

}
