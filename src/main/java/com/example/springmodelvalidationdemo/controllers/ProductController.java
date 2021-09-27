package com.example.springmodelvalidationdemo.controllers;

import com.example.springmodelvalidationdemo.models.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/products")

//  extra documentation at the API level
//  description is deprecated; use tags instead
@Api(value = "products", tags = {"Products API"})
public class ProductController {
    @ApiOperation(value = "Get a random product")
    @GetMapping
    public ResponseEntity<Product> get() {
        return ResponseEntity.ok(new Product());
    }

    //  @Valid for the RequestBody is required
    //  at method level
    @ApiOperation(value = "Create a new product")
    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody Product product) {
        return ResponseEntity.ok().build();
    }
}
