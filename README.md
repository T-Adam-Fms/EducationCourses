Database Structure Recap

    customers table:
        customer_id (Primary Key)
        Other fields: first_name, last_name, email, etc.

    products table:
        product_id (Primary Key)
        Other fields: product_name, price, etc.

    orders table:
        order_id (Primary Key)
        customer_id (Foreign Key to customers)
        Other fields: total_amount, order_date, etc.

    order_items table:
        order_item_id (Primary Key)
        order_id (Foreign Key to orders)
        product_id (Foreign Key to products)
        Other fields: quantity, price_per_item

How the Code Aligns with the Database Structure
1. Customer Entity and DAO

    Customer.java represents the customers table.
    In the CustomerDAO, the addCustomer() method will insert a new customer into the database, returning the generated customer_id.
    The TestMain script uses customer.setCustomerId() to link the created customer to subsequent operations.

2. Product Entity and DAO

    Product.java represents the products table.
    In the ProductDAO, the addProduct() method inserts new products into the database, returning the product_id.

3. Order Entity and DAO

    Order.java represents the orders table.
    The Order class takes the customer_id (Foreign Key to customers) and totalAmount.
    In the OrderDAO, the addOrder() method inserts the order into the orders table, ensuring the customer_id is correctly passed as a foreign key.

4. OrderItem Entity and DAO

    OrderItem.java represents the order_items table.
    The OrderItem class takes the productId, quantity, and pricePerItem, corresponding to the product_id (Foreign Key to products) and the fields in the order_items table.
    In the OrderDAO, the appendOrderItem() method inserts items into the order_items table, ensuring order_id (Foreign Key to orders) and product_id are correctly inserted.

Ensuring Foreign Key Relationships

    The relationships between customers, orders, products, and order_items are preserved through foreign key constraints in the database:
        orders.customer_id → customers.customer_id
        order_items.order_id → orders.order_id
        order_items.product_id → products.product_id


