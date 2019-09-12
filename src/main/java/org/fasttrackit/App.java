package org.fasttrackit;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Rescuer rescuer = new Rescuer("Arnold", 103.6);


        Animal animal = new Animal("Rex");
        animal.favoriteActivity = "Fetch";
        animal.favoriteFood = "Bones";
        animal.age = 5;
        animal.happiness = 55;
        animal.health = 70;
        animal.hungerLevel = 46;

        System.out.println("Hunger level for this animal is: " + animal.hungerLevel + "/100");
        System.out.println("Health level for this animal is: " + animal.health + "/100");
        System.out.println("Happiness level for this animal is: " + animal.happiness + "/100");


        Food food = new Food("bones", 15.4, 7, "yes", LocalDate.now());


        RecreationalActivity recreationalActivity = new RecreationalActivity("Fetch");


        Veterinarian veterinarian = new Veterinarian("Marcela", "Surgery");


        Dog dog = new Dog("Hard", "Medium");

        Game game = new Game();
        game.veterinarian = veterinarian;
        game.dog = dog;
        game.rescuer = rescuer;

    }

}
