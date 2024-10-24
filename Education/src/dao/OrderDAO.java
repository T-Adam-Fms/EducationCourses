package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import entity.Order;
import util.DatabaseConnection;
import entity.OrderItem;

public class OrderDAO {

    // Insert a new order into the database
    public void addOrder(Order order) throws SQLException {
        String sql = "INSERT INTO orders (customer_id, total_amount) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, order.getCustomer().getCustomerId());
            stmt.setDouble(2, order.getTotalAmount());
            stmt.executeUpdate();
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    order.setOrderId(generatedKeys.getInt(1));
                }
            }
        }
    }

    // Insert order items into the database
    public void addOrderItems(List<OrderItem> orderItems, int orderId) throws SQLException {
        String sql = "INSERT INTO order_items (order_id, product_id, quantity, price_per_item) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            for (OrderItem item : orderItems) {
                stmt.setInt(1, orderId);
                stmt.setInt(2, item.getProduct().getProductId());
                stmt.setInt(3, item.getQuantity());
                stmt.setDouble(4, item.getPricePerItem());
                stmt.addBatch();
            }
            stmt.executeBatch();
        }
    }
}

