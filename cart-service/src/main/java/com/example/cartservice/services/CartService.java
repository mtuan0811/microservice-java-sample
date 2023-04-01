package com.example.cartservice.services;

import com.example.cartservice.domain.Cart;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CartService {
    private static ArrayList<Cart> listCarts = new ArrayList<>();

    public void addProduct(Cart cart){
        listCarts.add(cart);
    }

    public ArrayList<Cart> getCart(){
        return listCarts;
    }
}
