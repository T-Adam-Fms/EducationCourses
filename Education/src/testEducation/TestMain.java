package testEducation;


import dao.CustomerDAO;
import entity.Customer;

public class TestMain{
    public static void main(String[] args) {
        try {
            // Test CustomerDAO
            testCustomerDAO();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Test CustomerDAO methods
    public static void testCustomerDAO() throws Exception {
        CustomerDAO customerDAO = new CustomerDAO();

        // Add a new customer
        Customer customer = new Customer(0, "John", "Doe", "johndoe@example.com", "123 Main St", "123-456-7890");
        customerDAO.addCustomer(customer);
        System.out.println("Customer added successfully!");

        // Fetch customer by email
        Customer fetchedCustomer = customerDAO.getCustomerByEmail("johndoe@example.com");
        System.out.println("Fetched Customer: " + fetchedCustomer.getFirstName() + " " + fetchedCustomer.getLastName());
    }
}

