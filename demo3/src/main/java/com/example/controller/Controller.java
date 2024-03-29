package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class Controller {
    private final ProductService productService;

    public Controller(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAll(){
        List<Product> productList;
        productList = productService.getAll();
        return  ResponseEntity.ok(productList);
    }

    @GetMapping("/getById/{Id}")
    public  ResponseEntity<Product> getById(@PathVariable long Id){
        Product  product = productService.getById(Id);
        return ResponseEntity.ok(product);
    }

    @PostMapping("/create")
    public  ResponseEntity<Product>create(@RequestBody Product product){
        productService.create(product);
        return  ResponseEntity.ok(product);
    }
}
