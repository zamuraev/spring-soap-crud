package com.zamuraev.service;

import com.zamuraev.entities.Product;
import com.zamuraev.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductWsImpl implements ProductWs {

    private final ProductRepository productRepo;

    @Override
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProduct(int id) {
        return productRepo.findById(id).get();
    }

    @Override
    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepo.save(product);
    }
}
