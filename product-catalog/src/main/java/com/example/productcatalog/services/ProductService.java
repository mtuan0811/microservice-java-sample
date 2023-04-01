package com.example.productcatalog.services;

import com.example.productcatalog.domain.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ProductService {
    private ArrayList<Product> listProducts = new ArrayList<>();

    public ProductService(){
        listProducts.add(new Product("Product1", 10, 10));
        listProducts.add(new Product("Product2", 11, 5));
        listProducts.add(new Product("Product3", 12, 8));
    }

    public Product getProductByName(String name){
        return listProducts.stream().findAny().filter(s-> s.getName().equals(name)).get();
    }

    public ArrayList<Product> getAll(){
        return listProducts;
    }
}
