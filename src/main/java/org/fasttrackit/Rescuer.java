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

    public void feed(Animal animal, Food food) {
        System.out.println("Current animal hunger level is: " + animal.getHungerLevel() + "/10");
        System.out.println(this.getName() + " just gave some " + food.getName()+ " food to " + animal.getName());
        animal.setHungerLevel(animal.getHungerLevel() + 1);
        System.out.println("New hunger level for this animal is: " + animal.getHungerLevel() + "/10");
    }

    public void playFetch (Animal animal, RecreationalActivity recreationalActivity) {
        System.out.println("Current animal happiness is: " + animal.getHappiness() + "/10");
        System.out.println(this.getName() + " plays " + recreationalActivity.getName() + " with animal " + animal.getName());
        animal.setHappiness(animal.getHappiness() + 1);
        System.out.println("New happiness level for " + animal.getName() + " is: " + animal.getHappiness() + "/10");
    }
}
