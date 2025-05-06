package com.example.demo.service.implement;

import com.example.demo.dto.request.ProductRequest;
import com.example.demo.service.XuLySanPham;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class XuLySanPhamImpl implements XuLySanPham {
    ProductRequest productRequest1 = new ProductRequest("quan",11111, "quan1", "nhucutngua", 901);
    ProductRequest productRequest2 = new ProductRequest("quan",22222, "ao1", "nhucutchim", 902);
    ProductRequest productRequest3 = new ProductRequest("quan",33333, "quan2", "nhucuttrau", 903);
    ProductRequest productRequest4 = new ProductRequest("quan",44444, "ao2", "nhucutboha", 904);
    ProductRequest ProductRequest5 = new ProductRequest("quan",55555, "quan3", "nhucuttet", 900);

    List<ProductRequest> listProduct = new ArrayList<>(List.of(productRequest1,
            productRequest2,
            productRequest3,
            productRequest4,
            ProductRequest5));


    @Override
    public void themsp(ProductRequest addproductRequest) {
        ProductRequest productRequest = new ProductRequest(addproductRequest.getLoai(),
                addproductRequest.getId(),
                addproductRequest.getName(),
                addproductRequest.getMieuta(),
                addproductRequest.getGia()
        );
        listProduct.add(productRequest);
    }

    @Override
    public void xoaSP( String name ) {
        listProduct.remove(getProductRequest(name));
    }

    @Override
    public List<ProductRequest> getProducts() {

        return listProduct;
    }

    @Override
    public ProductRequest getProductRequest(String name) {
        for (ProductRequest productRequest : listProduct) {
            if (productRequest.getName().equals(name))
                return productRequest;
        }
        return null;
    }

    @Override
    public List<ProductRequest> getProductRequestbyname(String name) {
        List<ProductRequest> listProductgetbyname = new ArrayList<>();
        int number = 0;

        for (ProductRequest productRequest : listProduct) {
            if (productRequest.getName().equals(name)) {
                listProductgetbyname.add(productRequest);
                number++;
            }

        }
        if(number == 0)
            return null;
        else
            return listProductgetbyname;

    }

}

