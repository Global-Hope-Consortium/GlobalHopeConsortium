package com.globalhopeconsortium.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElectronicsController {
    
    @GetMapping("/electronics")
    public String getElectronics() {
        return "List of electronic items";
    }
}