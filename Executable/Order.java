package com.shop.orders;

import com.shop.customers.Customer;
import com.shop.products.Product;

public class Order {
    private Customer customer;
    private Product product;

    public Order(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    public void displayOrderDetails() {
        System.out.println("Order Details:");
        customer.displayCustomerInfo();
        product.displayInfo();
    }
}
