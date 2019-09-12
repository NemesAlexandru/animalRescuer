package org.fasttrackit;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Rescuer rescuer = new Rescuer("Arnold", 103.6);


        Animal animal = new Animal("Rex");
        animal.setFavoriteActivity("Fetch");
        animal.setFavoriteFood("Bones");
        animal.setAge(5);
        animal.setHappiness(55);
        animal.setHealth(70);
        animal.setHungerLevel(46);

        System.out.println("Hunger level for this animal is: " + animal.getHungerLevel() + "/100");
        System.out.println("Health level for this animal is: " + animal.getHealth() + "/100");
        System.out.println("Happiness level for this animal is: " + animal.getHappiness() + "/100");


        Food food = new Food("bones", 16.5, 7, "yes", LocalDate.now());
        System.out.println(food.getName());


        RecreationalActivity recreationalActivity = new RecreationalActivity("Fetch");


        Veterinarian veterinarian = new Veterinarian("Marcela", "Surgery");


        Dog dog = new Dog("Hard", "Medium");

        Game game = new Game();

    }

}
