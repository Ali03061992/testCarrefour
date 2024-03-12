package com.carrefour.test.services;

import com.carrefour.test.domain.DeliverySlot;
import com.carrefour.test.domain.enumuration.DeliveryMode;
import com.carrefour.test.services.Impl.DeliveryServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeliveryServiceImplTest {

    @InjectMocks
    private DeliveryServiceImpl deliveryService;

    @Mock
    private LocalDateTime localDateTimeMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void testGetDeliveryModes() {
        List<DeliveryMode> deliveryModes = deliveryService.getDeliveryModes();
        assertEquals(Arrays.asList(DeliveryMode.values()), deliveryModes);
    }

    @Test
    void testGetDeliverySlots() {
        DeliveryMode deliveryMode = DeliveryMode.DELIVERY;
        List<DeliverySlot> deliverySlots = deliveryService.getDeliverySlots(deliveryMode);

        // Assuming that your getDeliverySlots method returns predefined slots
        List<DeliverySlot> expectedSlots =List.of(
                new DeliverySlot(1L, LocalDateTime.of(2024,3,4,5,6), LocalDateTime.of(2024,3,4,5,6).plusHours(2))
        );

        assertEquals(expectedSlots, deliverySlots);
    }
}