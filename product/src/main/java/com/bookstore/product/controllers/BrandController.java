package com.bookstore.product.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/brand")
public class BrandController {
    @GetMapping("/")
    ResponseEntity<?> greeting() {
        return ResponseEntity.ok("hello world!");
    }
}
