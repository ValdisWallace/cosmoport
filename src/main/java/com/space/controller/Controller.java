package com.space.controller;

import com.space.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/rest/ships")
public class Controller {
    private ShipService shipService;

    @Autowired
    public Controller(ShipService shipService) {
        this.shipService = shipService;
    }

    @GetMapping
    public ResponseEntity getAll() {
        return ResponseEntity.ok(shipService.getAll());
    }
}
