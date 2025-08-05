package com.example.demo.service.Implement;

import com.example.demo.dto.request.UserCreateRequestDTO;
import com.example.demo.dto.request.UserLoginRequestDTO;
import com.example.demo.dto.response.UserCreateResponseDTO;
import com.example.demo.dto.response.UserListProductResponseDTO;
import com.example.demo.entity.Cart;
import com.example.demo.entity.Cart_Iterm;
import com.example.demo.entity.Product;
import com.example.demo.repository.CartRepository;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User; // ✅ đường dẫn đúng của class bạn

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserValidateServiceImpl userValidateServiceImpl;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private OrderRepository orderRepository;


    @Override
    public UserCreateResponseDTO createUser(UserCreateRequestDTO user) {
        String error = userValidateServiceImpl.ValidateCheckCreate(user);
        UserCreateResponseDTO userRes = new UserCreateResponseDTO();
        if (error != null) {
            userRes.setError(error);
            return userRes;
        }
        User user1 = userRepository.findByFullname(user.getFullname());
        if (user1 != null) {
            UserCreateResponseDTO userRes1 = new UserCreateResponseDTO();
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


    @Override
    public Object login(UserLoginRequestDTO user) {
        userValidateServiceImpl.ValidateCheckLogin(user);
        if (user.getError() == null) {
            User user1 = userRepository.selectUserByEmailAndPassWord(user.getEmail(), user.getPassword());
            return "đăng nhập thành công!!!" + user1.getEmail() + user1.getFullname();
        }

        return user.getError();

    }

    @Override
    public UserCreateResponseDTO getUserById(int id) {
        User user = userRepository.selectUserById(id);
        UserCreateResponseDTO userRes = new UserCreateResponseDTO();
        if (user != null) {
            userRes.setName(user.getFullname());
            userRes.setEmail(user.getEmail());
            userRes.setError(null);
            return userRes;

        }
        return null;
    }


    @Override
    public List<Product> showallproduct() {
        return productRepository.findAll();
    }

    @Override
    public Object addProduct(UserLoginRequestDTO user1, String nameProduct, int quantity) {
        userValidateServiceImpl.ValidateCheckLogin(user1);
        if (user1.getError() == null) {
            return user1.getError();
        }
        User user = userRepository.selectUserByEmailAndPassWord(user1.getEmail(), user1.getPassword());

        if (user == null) {
            return "khong cos user nay!!!!!";
        }
        Product product = productRepository.findByName(nameProduct);
        if (product == null) {
            return "không tìm thấy sản phẩm: " + nameProduct;
        }
        Cart cart = user.getCart();
        Cart_Iterm cart_Iterm = new Cart_Iterm();
        cart_Iterm.setCart(cart);
        cart_Iterm.setProduct(product);
        cart_Iterm.setQUANTITY(quantity);
        cart.getCartItermList().add(cart_Iterm);

        product.setStock(product.getStock() - quantity);
        productRepository.save(product);
        cartRepository.save(cart);

        return "đã thêm sản phẩm " + nameProduct + "vào giỏ hàng!!";
    }

    @Override
    public Object userCheckListProduct(String email) {

        User user1 = userRepository.selectUserByEmail(email);
        if (user1 == null) {
            return "user not found!!!";
        }
        Cart cart = user1.getCart();
        UserListProductResponseDTO userRes = new UserListProductResponseDTO();
        userRes.setItermList(cart.getCartItermList());
        return userRes.getItermList();

    }

    @Override
    public Object userDeleteProduct(UserLoginRequestDTO user, String nameProduct) {
        userValidateServiceImpl.ValidateCheckLogin(user);
        if (user.getError() == null) {
            return user.getError();
        }
        User user1 = userRepository.selectUserByEmailAndPassWord(user.getEmail(), user.getPassword());
        if (user1 == null) {
            return " khong co user nay!!!";
        }
        Cart cart = user1.getCart();
        if (cart == null || cart.getCartItermList().isEmpty()) {
            return " user nay chua them san pham nao vao gio hang!!!";
        }
        userRepository.deleteProductByName(nameProduct, cart.getID_CART());
        return "da xoa thanh cong san pham " + nameProduct + "ra khoi gio hang!!";
    }

}











