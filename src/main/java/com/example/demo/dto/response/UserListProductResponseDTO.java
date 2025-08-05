package com.example.demo.dto.response;

import com.example.demo.entity.Cart_Iterm;

import java.util.List;

public class UserListProductResponseDTO {
    private List<Cart_Iterm> itermList;

    public UserListProductResponseDTO() {
    }

    public List<Cart_Iterm> getItermList() {
        return itermList;
    }

    public void setItermList(List<Cart_Iterm> itermList) {
        this.itermList = itermList;
    }
}
