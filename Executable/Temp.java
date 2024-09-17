// package com;
// we can also place temp file in com folder

import com.shop.customers.Customer;
import com.shop.orders.Order;
import com.shop.products.Electronics;
// Customer class is imported from the package "com.shop.customers"
public class Temp {

    public static void main(String[] args) {
         Customer customer = new Customer("Alice", "alice@example.com");

         Electronics laptop = new Electronics("Laptop", 1200.00, "Dell");
 
         Order order = new Order(customer, laptop);
        //  In Java, a subclass object (e.g., Electronics) can be treated as an instance of its superclass (e.g., Product).

         order.displayOrderDetails();
    }
}