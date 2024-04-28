package com.example.module.design.dmt;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lrf
 * @create 2024/4/3
 */

public class Order {
    
    private String orderId;
    
    private Customer customer;
    
    private List<OrderItem> orderItems;
    
    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderItems = new ArrayList<>();
    }
    
    public void addOrderItem(Product product, int quantity) {
        this.orderItems.add(new OrderItem(product, quantity));
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
