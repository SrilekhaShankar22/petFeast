package com.petfeast.controller;

import com.petfeast.dto.ProductDto;
import com.petfeast.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:4200")  // Allow Angular app access
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }


    @GetMapping("/category/{category}")
    public List<ProductDto> getProductsByCategory(@PathVariable String category) {
        return productService.getProductsByCategory(category);
    }
}
