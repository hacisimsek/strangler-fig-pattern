package com.hacisimsek.strangler_monolith.facade;

import com.hacisimsek.strangler_monolith.service.LegacyOrderService;
import com.hacisimsek.strangler_monolith.service.ModernOrderService;
import org.springframework.stereotype.Service;

@Service
public class StranglerFacade {
    private final LegacyOrderService legacyOrderService;
    private final ModernOrderService modernOrderService;
    private final FeatureToggleService featureToggleService;

    public StranglerFacade() {
        this.legacyOrderService = new LegacyOrderService();
        this.modernOrderService = new ModernOrderService();
        this.featureToggleService = new FeatureToggleService();
    }

    public String createOrder(String orderDetails) {
        if (featureToggleService.isNewOrderSystemEnabled()) {
            return modernOrderService.createOrder(orderDetails);
        }
        return legacyOrderService.createOrder(orderDetails);
    }

    public String getOrderStatus(String orderId) {
        if (featureToggleService.isNewStatusCheckEnabled()) {
            return modernOrderService.getOrderStatus(orderId);
        }
        return legacyOrderService.getOrderStatus(orderId);
    }
}