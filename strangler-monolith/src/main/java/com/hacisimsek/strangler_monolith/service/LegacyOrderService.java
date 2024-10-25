package com.hacisimsek.strangler_monolith.service;


public class LegacyOrderService {
    public String createOrder(String orderDetails) {
        return "Order created through Legacy system: " + orderDetails;
    }

    public String getOrderStatus(String orderId) {
        return "Legacy system - Order status: Processing";
    }
}
