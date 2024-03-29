package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product getById(long Id);

    Product create(Product p);
}
