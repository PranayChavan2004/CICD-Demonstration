package com.CICD_Demonstration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class mainController {

    @GetMapping
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Hello, this is Spring Boot application!");
    }
}
