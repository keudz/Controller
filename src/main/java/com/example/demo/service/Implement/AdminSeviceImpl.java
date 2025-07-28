package com.example.demo.service.Implement;

import com.example.demo.entity.Product;
import com.example.demo.entity.User;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public class AdminSeviceImpl implements AdminService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository  productRepository;

  @Override

   public List<User>  showAllUser() {
      return userRepository.findAll();
  }

  @Override
    public User blockUser(int id) {
      User user = userRepository.findById(id);
      if(user == null){
         return null;
      }

      user.setStatus("block");
      userRepository.save(user);
      return user;
  }

  @Override
    public Product addProduct(Product product) {
      Product newProduct = new Product();
      newProduct.setName(product.getName());
      newProduct.setPrice(product.getPrice());
      newProduct.setCategory(product.getCategory());
      newProduct.setOriginal_price(product.getOriginal_price());
      newProduct.setStock(product.getStock());
      productRepository.save(newProduct);
      return newProduct;
      }


  @Override
  public Product updateProduct (int id,String Attribute , String information) {

   Optional<Product> Product = productRepository.findById(id);
   if(Product.isPresent()){
       Product newProduct = Product.get();// để lấy các phương thức ở trong newProduct thì cần phai khai báo thêm dòng này
    if(Attribute.equals("name")){
       newProduct.setName(information);
    }
    if(Attribute.equals("price")){
        newProduct.setPrice(Double.parseDouble(information));//Double.parseDouble:là hàm chuyền từ String sang Double
    }
    if(Attribute.equals("category")){
        newProduct.setCategory(information);
    }
    if(Attribute.equals("original_price")){
        newProduct.setOriginal_price(Double.parseDouble(information));
          }
    if(Attribute.equals("stock")){
        newProduct.setStock(Integer.parseInt(information));
    }
    productRepository.save(newProduct);
    return newProduct;
       }
   return null;
    }


    @Override
    public Product deleteProduct (int id) {
      Optional<Product> product = productRepository.findById(id);
      if(product.isPresent()){
          Product product1 = product.get();
          productRepository.deleteById(id);
          return product1;
      }
         return null;
    }

    @Override
    public List<Product> showAllProduct() {
      return productRepository.findAll();
    }
}

