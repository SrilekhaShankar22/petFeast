package com.petfeast.repository;

import com.petfeast.dto.ProductDto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProductRepository {

    private final JdbcTemplate jdbc;

    public ProductRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }


    public List<ProductDto> findAll() {
        String sql = "SELECT product_id, name, category, type, price, stock, description, created_at FROM products";
        return jdbc.query(sql, (rs, rowNum) ->
                new ProductDto(
                        rs.getInt("product_id"),
                        rs.getString("name"),
                        rs.getString("category"),
                        rs.getString("type"),
                        rs.getDouble("price"),
                        rs.getInt("stock"),
                        rs.getString("description"),
                        rs.getTimestamp("created_at")
                ));
    }


    public List<ProductDto> findByCategory(String category) {
        String sql = "SELECT product_id, name, category, type, price, stock, description, created_at FROM products WHERE category = ?";
        return jdbc.query(sql, new Object[]{category}, (rs, rowNum) ->
                new ProductDto(
                        rs.getInt("product_id"),
                        rs.getString("name"),
                        rs.getString("category"),
                        rs.getString("type"),
                        rs.getDouble("price"),
                        rs.getInt("stock"),
                        rs.getString("description"),
                        rs.getTimestamp("created_at")
                ));
    }
}
