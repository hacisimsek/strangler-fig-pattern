package com.hacisimsek.strangler_monolith.service;

public class ModernOrderService {
    public String createOrder(String orderDetails) {
        return "An order was created through the new system: " + orderDetails;
    }

    public String getOrderStatus(String orderId) {
        return "New system - Order status: Processing (with detailed tracking)";
    }
}
