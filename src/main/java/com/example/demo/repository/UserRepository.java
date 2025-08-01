package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
       //User là bảng còn Integer là kiểu dữ liệu của id
       User findById(int id);
       User findByFullname(String name);
       User findByEmail(String email);

}
