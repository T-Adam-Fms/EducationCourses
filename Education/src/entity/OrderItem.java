package entity;


public class OrderItem {
    private int orderItemId;
    private Product product;
    private int quantity;
    private double pricePerItem;

    // Constructors, Getters, and Setters
    public OrderItem(int orderItemId, Product product, int quantity, double pricePerItem) {
        this.orderItemId = orderItemId;
        this.product = product;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

    // Getters and Setters
    
}

