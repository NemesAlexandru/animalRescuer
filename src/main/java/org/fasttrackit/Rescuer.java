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
        if (animal.getFavoriteFood().equals(food.getName())){
            System.out.println("The animal loves this food");
            animal.setHappiness(animal.getHappiness()+1);
            System.out.println("Animal happiness level is: " + animal.getHappiness());
        }

        else {
            System.out.println("Animal hates this food.");
            System.out.println("Happiness level unchanged: " + animal.getHappiness() + "/10.");
        }

        System.out.println("Current animal hunger level is: " + animal.getHungerLevel() + "/10");
        System.out.println(this.getName() + " just gave some " + food.getName()+ " food to " + animal.getName());
        animal.setHungerLevel(animal.getHungerLevel() + 1);
        System.out.println("New hunger level for this animal is: " + animal.getHungerLevel() + "/10");
    }

    public void playFetch (Animal animal, RecreationalActivity recreationalActivity) {

        if (animal.getFavoriteActivity().equals(recreationalActivity.getName())) {
            System.out.println("Current happiness level for " + animal.getName() + " is: " + animal.getHappiness());
            animal.setHappiness(animal.getHappiness() + 2);
            System.out.println("New happiness level is: " + animal.getHappiness());
        }
        else {
            System.out.println("Animal hates this food.");
            animal.setHappiness(animal.getHappiness() + 1);
            System.out.println("New happiness level is: " + animal.getHappiness());
        }
    }
    }

