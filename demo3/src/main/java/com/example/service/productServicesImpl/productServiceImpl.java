package com.example.service.productServicesImpl;

import com.example.model.Product;
import com.example.repositories.ProductRepository;
import com.example.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productServiceImpl implements ProductService {
    ProductRepository repository;

    public productServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public Product getById(long Id) {
        return repository.findById(Id).orElse(null);
    }

    @Override
    public Product create(Product p) {
        return repository.save(p);
    }
}
