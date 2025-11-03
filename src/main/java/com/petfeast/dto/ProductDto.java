package com.petfeast.dto;

import java.sql.Timestamp;

public class ProductDto {
    private int productId;
    private String name;
    private String category;
    private String type;
    private double price;
    private int stock;
    private String description;
    private Timestamp createdAt;

    public ProductDto() {}

    public ProductDto(int productId, String name, String category, String type, double price, int stock, String description, Timestamp createdAt) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.type = type;
        this.price = price;
        this.stock = stock;
        this.description = description;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }
}
