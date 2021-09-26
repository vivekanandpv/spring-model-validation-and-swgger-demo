package com.example.springmodelvalidationdemo.controllers;

import com.example.springmodelvalidationdemo.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
    @GetMapping
    public ResponseEntity<Product> get() {
        return ResponseEntity.ok(new Product());
    }

    //  @Valid for the RequestBody is required
    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody Product product) {
        return ResponseEntity.ok().build();
    }
}
