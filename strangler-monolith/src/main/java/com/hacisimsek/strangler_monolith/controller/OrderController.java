package com.hacisimsek.strangler_monolith.controller;

import com.hacisimsek.strangler_monolith.facade.StranglerFacade;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final StranglerFacade stranglerFacade;

    public OrderController(StranglerFacade stranglerFacade) {
        this.stranglerFacade = stranglerFacade;
    }

    @PostMapping
    public String createOrder(@RequestBody String orderDetails) {
        return stranglerFacade.createOrder(orderDetails);
    }

    @GetMapping("/{orderId}")
    public String getOrderStatus(@PathVariable String orderId) {
        return stranglerFacade.getOrderStatus(orderId);
    }
}