package com.example.productcatalog.controllers;

import com.example.productcatalog.domain.Product;
import com.example.productcatalog.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.net.http.HttpHeaders;
import java.util.ArrayList;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping("/all")
    public ArrayList<Product> getProducts(@RequestHeader("sub") String sub){
        System.out.println(sub);
        return this.productService.getAll();
    }

    @GetMapping("/get/{name}")
    public Product getProduct(@PathVariable String name){
        return this.productService.getProductByName(name);
    }
}
