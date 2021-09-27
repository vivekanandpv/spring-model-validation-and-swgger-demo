package com.example.springmodelvalidationdemo.models;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class Product {
    //  Required dependency: Spring Boot Starter Validation:
    //  https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-validation

    //  Learn more about javax validation api here:
    //  https://javaee.github.io/javaee-spec/javadocs/javax/validation/constraints/package-summary.html

    @Min(value = 1001)
    @Max(value = 10000)
    private int id;

    @NotBlank(message = "Cannot accept null, empty, or whitespace for product name")
    @Size(min = 5, max = 50, message = "Product name should be in the range of [5-50] characters")
    private String name;

    private String category;

    @NotNull(message = "Cannot accept product without date of manufacture")
    @Past(message = "Date of manufacture should be a past date")
    private LocalDate dateOfManufacture;

    @NotNull(message = "Date of expiry is required for a product")
    @Future(message="Date of expiry should be a future date")
    private LocalDate dateOfExpiry;

    @Min(value = 1, message = "Cannot accept the stock less than 1")
    @Max(value = 1000)
    private int stock;

    @Min(value = 1, message = "Unit price must be at least 1")
    private double unitPrice;

    @NotBlank(message = "Product SKU cannot be null, empty, or blank")
    @Pattern(regexp = "^[A-Z]{3}[0-9]{5}$", message = "Invalid SKU pattern")
    private String sku;

    @Email(message = "Entered by should be a proper email")
    private String enteredBy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public LocalDate getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(LocalDate dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getEnteredBy() {
        return enteredBy;
    }

    public void setEnteredBy(String enteredBy) {
        this.enteredBy = enteredBy;
    }
}
