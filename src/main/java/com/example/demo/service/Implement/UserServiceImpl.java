package com.example.demo.service.Implement;

import com.example.demo.dto.request.UserCreateRequestDTO;
import com.example.demo.dto.response.UserCreateResonseDTO;
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
import java.util.Optional;

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


    @Override
    public String login(UserCreateResonseDTO user) {
        return "success";
    }

    @Override
    public User getUserById(int id) {
        User user = new User();
        user = userRepository.findById(id);
        if (user != null) {
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

    @Override
    public Object addProduct(String email, String nameProduct, int quantity) {

        User user = userRepository.findByEmail(email);
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

        return "đã thêm sản phẩm " + "" + nameProduct + "vào giỏ hàng!!";
    }

    @Override
    public Object userCheckListProduct(String email) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            return "khong co user nay!!!!!";
        }

        Cart cart = user.getCart();
        if (cart == null || cart.getCartItermList().isEmpty()) {
            return "khong co san pham nao trong gio hang!!!";
        }
        List<Cart_Iterm> items = cart.getCartItermList();
        List<String> result = new ArrayList<>();
        for (Cart_Iterm item : items) {
            result.add("Sản phẩm: " + item.getProduct().getName() +
                    " | Số lượng: " + item.getQUANTITY());
        }
        return result;
    }

    @Override
    public String userDeleteProduct(String email, String nameProduct) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            return " khong co user nay!!!";
        }

        Cart cart = user.getCart();
        if (cart == null || cart.getCartItermList().isEmpty()) {
            return " user nay chua them san pham nao vao gio hang!!!";
        }
        List<Cart_Iterm> items = cart.getCartItermList();
        int count = 0;
        Iterator<Cart_Iterm> iterator = items.iterator();
        while (iterator.hasNext()) {
            Cart_Iterm item = iterator.next();
            if (item.getProduct().getName().equalsIgnoreCase(nameProduct)) {
                iterator.remove();
                count++;
            }
        }

        if (count == 0) {
            return "kh co san pham nay trong gio hang";
        }
        cartRepository.save(cart);
        return "da xoa san pham khoi gio hang!!";
          }
    }













