package entity;

public class LoggedUser {
    private int userId;
    private String username;
    private String password;
    private Customer customer; // Association with Customer

    // Constructors, Getters, and Setters
    public LoggedUser(int userId, String username, String password, Customer customer) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.customer = customer;
    }

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

    // Getters and Setters
    
}