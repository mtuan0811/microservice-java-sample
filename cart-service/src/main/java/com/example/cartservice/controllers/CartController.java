package com.example.cartservice.controllers;

import com.example.cartservice.domain.Cart;
import com.example.cartservice.services.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/cart")
public class CartController {
    private CartService cartService;
    public CartController(CartService cartService){
        this.cartService = cartService;
    }
    @GetMapping("/all")
    public ArrayList<Cart> getCart(){
        return this.cartService.getCart();
    }
}
