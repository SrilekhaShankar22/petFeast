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
        String sql = "SELECT id, name, category, description, price, stock_quantity, image_url FROM products";
        return jdbc.query(sql, (rs, rowNum) ->
                new ProductDto(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("category"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getInt("stock_quantity"),
                        rs.getString("image_url")
                ));
    }

    public List<ProductDto> findByCategory(String category) {
        String sql = "SELECT * FROM products WHERE category = ?";
        return jdbc.query(sql, new Object[]{category}, (rs, rowNum) ->
                new ProductDto(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("category"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getInt("stock_quantity"),
                        rs.getString("image_url")
                ));
    }
}
