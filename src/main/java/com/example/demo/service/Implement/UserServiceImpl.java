package com.example.demo.service.Implement;

import com.example.demo.dto.request.UserCreateRequestDTO;
import com.example.demo.dto.response.UserCreateResonseDTO;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User; // ✅ đường dẫn đúng của class bạn

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserValidateServiceImpl userValidateServiceImpl;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override

    public UserCreateResonseDTO createUser(UserCreateRequestDTO user) {
        String error = userValidateServiceImpl.ValidateCheckLogin(user);
        UserCreateResonseDTO userRes = new UserCreateResonseDTO();
        if (error != null) {
            userRes.setError(error);
            return userRes;
        }
        User user1 = userRepository.findByFullname(user.getFullname());
        if (user1 != null) {
            UserCreateResonseDTO userRes1 = new UserCreateResonseDTO();
            userRes1.setError("ten tai khoan nay da ton tai");
            return userRes1;
        }
        User userCreate = new User();
        userCreate.setFullname(user.getFullname());
        userCreate.setPassword(user.getPassword());
        userCreate.setEmail(user.getEmail());
        userCreate.setRole("Costumer");
        userCreate.setStatus("Active");
        userRepository.save(userCreate);


        userRes.setEmail(user.getEmail());
        userRes.setName(user.getFullname());
        userRes.setError("đã tạo tài khoản thành công!!");
        return userRes;
    }


    @
            Override
    public String login(UserCreateResonseDTO user) {
        return "success";
    }

    @Override
    public User getUserById(int id) {
        User user = new User();
        user = userRepository.findById(id);
        if(user != null) {
            System.out.println("nguyen the dat!!!");
            return user;
        }
        return null;
        }


    @Override
    public List<Product> showallproduct() {
        Product product = new Product();
        return productRepository.findAll();
    }






}