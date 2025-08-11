package com.example.springwebappdemo.service;

import com.example.springwebappdemo.model.Product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts() {
        return List.of(
                new Product("Laptop", 3500.00),
                new Product("Mouse", 150.00)
        );
    }
}
