package com.carrefour.test.controller;


import com.carrefour.test.domain.DeliverySlot;
import com.carrefour.test.domain.enumuration.DeliveryMode;
import com.carrefour.test.services.DeliveryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class DeliveryControllerTest {

    @Mock
    private DeliveryService deliveryService;

    @InjectMocks
    private DeliveryController deliveryController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetDeliveryModes() {
        // Mock the behavior of the deliveryService
        List<DeliveryMode> mockModes = Arrays.asList(DeliveryMode.DELIVERY, DeliveryMode.DELIVERY);
        when(deliveryService.getDeliveryModes()).thenReturn(mockModes);

        // Call the controller method
        ResponseEntity<List<DeliveryMode>> responseEntity = deliveryController.getDeliveryModes();

        // Verify the result
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(mockModes, responseEntity.getBody());
    }

    @Test
    void testGetDeliverySlots() {
        // Mock the request parameter
        DeliveryMode deliveryMode = DeliveryMode.DELIVERY;

        // Mock the behavior of the deliveryService
        List<DeliverySlot> mockSlots = Arrays.asList(
                new DeliverySlot(1l, LocalDateTime.now(), LocalDateTime.MAX),
                new DeliverySlot(2l, LocalDateTime.now(), LocalDateTime.MAX)
        );
        when(deliveryService.getDeliverySlots(deliveryMode)).thenReturn(mockSlots);

        // Call the controller method
        ResponseEntity<List<DeliverySlot>> responseEntity = deliveryController.getDeliverySlots(deliveryMode);

        // Verify the result
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(mockSlots, responseEntity.getBody());
    }
}
