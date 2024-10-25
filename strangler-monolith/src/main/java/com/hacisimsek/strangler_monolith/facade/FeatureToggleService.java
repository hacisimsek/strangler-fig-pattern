package com.hacisimsek.strangler_monolith.facade;

import org.springframework.stereotype.Service;

@Service
public class FeatureToggleService {
    public boolean isNewOrderSystemEnabled() {
        return true;
    }

    public boolean isNewStatusCheckEnabled() {
        return false;
    }
}