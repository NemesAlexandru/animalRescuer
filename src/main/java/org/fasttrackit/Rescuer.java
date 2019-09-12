package org.fasttrackit;

public class Rescuer {
    private String name;
    private double moneyAvailable;

    public Rescuer(String name, double moneyAvailable) {
        this.name = name;
        this.moneyAvailable = moneyAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoneyAvailable() {
        return moneyAvailable;
    }

    public void setMoneyAvailable(double moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }
}
