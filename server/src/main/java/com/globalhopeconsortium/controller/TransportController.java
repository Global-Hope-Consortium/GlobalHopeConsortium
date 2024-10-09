package com.globalhopeconsortium.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransportController {
    
    @GetMapping("/transport")
    public String getTransportServices() {
        return "List of transport services";
    }
}