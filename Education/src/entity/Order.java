package entity;

import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private double totalAmount;
    private List<OrderItem> orderItems;

    // Constructors, Getters, and Setters
    public Order(int orderId, Customer customer, double totalAmount, List<OrderItem> orderItems) {
        this.orderId = orderId;
        this.customer = customer;
        this.totalAmount = totalAmount;
        this.orderItems = orderItems;
    }

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

    // Getters and Setters
    
}
