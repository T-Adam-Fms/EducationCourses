package entity;


public class Product {
    private int productId;
    private String productName;
    private String description;
    private String category;
    private int durationDays;
    private boolean isOnline;
    private double price;

    // Constructors, Getters, and Setters
    public Product(int productId, String productName, String description, String category, int durationDays, boolean isOnline, double price) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.category = category;
        this.durationDays = durationDays;
        this.isOnline = isOnline;
        this.price = price;
    }

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getDurationDays() {
		return durationDays;
	}

	public void setDurationDays(int durationDays) {
		this.durationDays = durationDays;
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

    // Getters and Setters
    
}