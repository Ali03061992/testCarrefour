package com.carrefour.test.services.Impl;

import com.carrefour.test.domain.DeliverySlot;
import com.carrefour.test.domain.enumuration.DeliveryMode;
import com.carrefour.test.services.DeliveryService;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class DeliveryServiceImpl implements DeliveryService {
    @Override
    public List<DeliveryMode> getDeliveryModes() {
        return Arrays.asList(DeliveryMode.values());
    }

    @Override
    public List<DeliverySlot> getDeliverySlots(DeliveryMode deliveryMode) {
        return List.of(
                new DeliverySlot(1L, LocalDateTime.of(2024,3,4,5,6), LocalDateTime.of(2024,3,4,5,6).plusHours(2))
        );
    }
}
