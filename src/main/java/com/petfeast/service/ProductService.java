package com.petfeast.service;

import com.petfeast.dto.ProductDto;
import com.petfeast.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDto> getAllProducts() {
        return productRepository.findAll();
    }

    public List<ProductDto> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }
}
