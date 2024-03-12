package com.carrefour.test.services;

import com.carrefour.test.domain.DeliverySlot;
import com.carrefour.test.domain.enumuration.DeliveryMode;

import java.util.List;

public interface DeliveryService {

    List<DeliveryMode> getDeliveryModes();

    List<DeliverySlot> getDeliverySlots(DeliveryMode deliveryMode);
}
