package org.fasttrackit;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Rescuer rescuer = new Rescuer();
        rescuer.name = "Arnold";
        System.out.println("Rescuer = " + rescuer.name);
        rescuer.moneyAvailable = 15.5;
        System.out.println("Money Available = " + rescuer.moneyAvailable);

        Animal animal = new Animal();
        animal.name = "Ianos";
        System.out.println("Animal Name = " + animal.name);
        animal.age = 4;
        System.out.println("Animal Age = " + animal.age);
        animal.hungerLevel = 6;
        System.out.println("Hunger Level = " + animal.hungerLevel + "/10");
        animal.health = 2;
        System.out.println("Health = " + animal.health + "/10");
        animal.favoriteFood = "Bones";
        System.out.println("Favorite food = " + animal.favoriteFood);
        animal.favoriteActivity = "Fetch";
        System.out.println("Favorite Activity = " + animal.favoriteActivity);
        animal.happiness = 3;
        System.out.println("Animal Happiness = " + animal.happiness + "/10");

        Food food = new Food();
        food.name = "Bones";
        System.out.println("Food Name = " + food.name);
        food.price = 13.4;
        System.out.println("Price = " + food.price);
        food.quantity = 20;
        System.out.println("Quantity = " + food.quantity);
        food.currentlyAvailable = "Yes";
        System.out.println("Currently Available = " + food.currentlyAvailable);


        RecreationalActivity recreationalActivity = new RecreationalActivity();
        recreationalActivity.name = "Fetch";
        System.out.println("Recreational Activity = " + recreationalActivity.name);

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Mike";
        System.out.println("Veterinarian Name = " + veterinarian.name);
        veterinarian.specialization = "Surgery";
        System.out.println("Specialization = " + veterinarian.specialization);

        Game game = new Game();
        game.rescuer = "Maria";
        game.dog = "Ianos";
        game.veterinarian = "Mike";

        System.out.println("Wild Animal");

        WildAnimal wildAnimal = new WildAnimal();
        wildAnimal.tame = "Difficult to tame";
        System.out.println(wildAnimal.tame);
        wildAnimal.accommodation = "Accommodates hard to new home";

        System.out.println("Activity: Fetch");
       Fetch fetch = new Fetch();
       fetch.cost = 0;
       fetch.happinessGain = 6;
        System.out.println("Cost for this activity is = " + fetch.cost);
        System.out.println("Happiness gain is = " + fetch.happinessGain + "/10");

    }

}
