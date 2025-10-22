package com.petfeast.service;

import com.petfeast.dto.ProductDto;
import com.petfeast.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service  // Tells Spring this is a service component
public class ProductService {

    private final ProductRepository productRepository;

    // Constructor injection
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Fetch all products
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll();
    }

    // Fetch by category
    public List<ProductDto> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }
}
