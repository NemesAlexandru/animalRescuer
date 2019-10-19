package org.fasttrackit;

import java.time.LocalDate;

public class Food {
    private String name;
    private double price;
    private int quantity;
    private String currentlyAvailable;
    private LocalDate expiryDate;
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Food(String name, double price, int quantity, int type) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCurrentlyAvailable() {
        return currentlyAvailable;
    }

    public void setCurrentlyAvailable(String currentlyAvailable) {
        this.currentlyAvailable = currentlyAvailable;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
