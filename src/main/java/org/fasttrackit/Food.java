package org.fasttrackit;

import java.time.LocalDate;

public class Food {
    String name;
    double price;
    int quantity;
    String currentlyAvailable;
    LocalDate expiryDate;

    public Food(String name, double price, int quantity, String currentlyAvailable, LocalDate expiryDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.currentlyAvailable = currentlyAvailable;
        this.expiryDate = expiryDate;
    }
}
