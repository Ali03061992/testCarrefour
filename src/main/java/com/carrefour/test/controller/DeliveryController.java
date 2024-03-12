package com.carrefour.test.controller;

import com.carrefour.test.domain.DeliverySlot;
import com.carrefour.test.domain.enumuration.DeliveryMode;
import com.carrefour.test.services.DeliveryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/delivery")
@Api(tags = "Delivery Management", description = "Endpoints for managing delivery options and slots")
@AllArgsConstructor
public class DeliveryController {

    private final DeliveryService deliveryService;

    @GetMapping("/modes")
    @ApiOperation("Get available delivery modes")
    public ResponseEntity<List<DeliveryMode>> getDeliveryModes() {
        return new ResponseEntity<>(deliveryService.getDeliveryModes(), HttpStatus.OK);
    }

    @GetMapping("/slots")
    @ApiOperation("Get available delivery slots")
    public ResponseEntity<List<DeliverySlot>> getDeliverySlots(@RequestParam("mode") DeliveryMode deliveryMode) {
        List<DeliverySlot> slots = deliveryService.getDeliverySlots(deliveryMode);
        return ResponseEntity.ok(slots);
    }
}
