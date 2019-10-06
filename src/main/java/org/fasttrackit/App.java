package org.fasttrackit;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Rescuer rescuer = new Rescuer("Arnold", 103.6);
        System.out.println("Rescuer name: " + rescuer.getName());
        System.out.println("Money available for " + rescuer.getName() + ": " + rescuer.getMoneyAvailable() + " Euro");

        Animal animal = new Animal("Rex");
        animal.setFavoriteActivity("Fetch");
        animal.setFavoriteFood("Bones");
        animal.setAge(5);
        animal.setHappiness(5);
        animal.setHealth(7);
        animal.setHungerLevel(4);
        animal.setName("Rex");

        System.out.println("Animal name: " + animal.getName());
        System.out.println("Hunger level for this animal is: " + animal.getHungerLevel() + "/10");
        System.out.println("Health level for this animal is: " + animal.getHealth() + "/10");
        System.out.println("Happiness level for this animal is: " + animal.getHappiness() + "/10");


        Food food = new Food("Bones", 16.5, 7, "yes", LocalDate.now());
        System.out.println("Food: " + food.getName());
        System.out.println("Food price is: " + food.getPrice() + " Euro");
        System.out.println("Quantity available is: " + food.getQuantity());
        System.out.println("Expiry date is: " + food.getExpiryDate());
        System.out.println("Currently available: " + food.getCurrentlyAvailable());


        RecreationalActivity recreationalActivity = new RecreationalActivity("Fetch");
        System.out.println("Recreational activity: " + recreationalActivity.getName());


        Veterinarian veterinarian = new Veterinarian("Marcela", "Surgery");
        System.out.println("Veterinarian name is " + veterinarian.getName());
        System.out.println("Veterinarian specialization is: " + veterinarian.getSpecialization());

        //Polymorphism
        Animal dog = new Dog("Hard", "Medium");
        //System.out.println("Taming difficulty for this animal is " + dog.getTamingDifficulty());
        //System.out.println("Accommodation difficulty level for this animal is " + dog.getAccommodationDifficulty());
        dog.setHappiness(5);
        dog.setName("Cicor");

        Game game = new Game();
        game.start();

        //Polymorphism
        Animal cat = new Cat();
        cat.setName("Mio");
        cat.setHappiness(8);

        rescuer.feed(animal, food);
        rescuer.playFetch(animal, recreationalActivity);

        Walking walking = new Walking(4, 0);

        animal.showMood();
        dog.showMood();
        cat.showMood();


    }
}
