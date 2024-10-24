package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entity.Product;
import util.DatabaseConnection;

public class ProductDAO {

    // Insert a new product into the database
    public void addProduct(Product product) throws SQLException {
        String sql = "INSERT INTO products (product_name, description, category, duration_days, is_online, price) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, product.getProductName());
            stmt.setString(2, product.getDescription());
            stmt.setString(3, product.getCategory());
            stmt.setInt(4, product.getDurationDays());
            stmt.setBoolean(5, product.isOnline());
            stmt.setDouble(6, product.getPrice());
            stmt.executeUpdate();
        }
    }

    // Get all products from the database
    public List<Product> getAllProducts() throws SQLException {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM products";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Product product = new Product(
                    rs.getInt("product_id"),
                    rs.getString("product_name"),
                    rs.getString("description"),
                    rs.getString("category"),
                    rs.getInt("duration_days"),
                    rs.getBoolean("is_online"),
                    rs.getDouble("price")
                );
                products.add(product);
            }
        }
        return products;
    }
}
