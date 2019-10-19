package org.fasttrackit;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Rescuer rescuer;
    private Animal animal;
    private Veterinarian veterinarian;
    private String chosenNameAnimal;
    private int animalType;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }


    public void start() {
        initRescuer();
        nameAnimal();
        initAnimal();
        initFood();
        initActivities();

        boolean winnerNotKnown = true;
        while (winnerNotKnown) {
            for (int i = 0; i <= 3; i++) {
                if (animal.getHungerLevel() > 5) {
                    requireFeeding();
                } else if (animal.getHappiness() < 8) {
                    requirePlaying();
                } else {
                    break;
                }
            }
            if (rescuer.getMoneyAvailable() < 5) {
                winnerNotKnown = false;
                System.out.println("\n");
                System.out.println("Game over");
                System.out.println("Your remaining budget: " + rescuer.getMoneyAvailable() + "$");
                System.out.println("Hunger Level: " + animal.getHungerLevel() + "/10");
                System.out.println("Happiness level: " + animal.getHappiness() + "/10");
            } else if (animal.getHappiness() >= 8 && animal.getHungerLevel() <= 5) {
                winnerNotKnown = false;
                System.out.println("\n");
                System.out.println("You win. Animal is happy. ");
                System.out.println("Your remaining budget: " + rescuer.getMoneyAvailable() + "$");
                System.out.println("Hunger Level: " + animal.getHungerLevel() + "/10");
                System.out.println("Happiness level: " + animal.getHappiness() + "/10");
            }
        }

    }

    private String initRescuer() {

        System.out.println("Please enter your name. ");
        Scanner scanner = new Scanner(System.in);
        try {
            String chosenName = scanner.nextLine();
            rescuer = new Rescuer(chosenName, 50);
            System.out.println("Hello " + rescuer.getName() + "!");
            System.out.println("Your budget is: " + rescuer.getMoneyAvailable() + "$");
            return chosenName;

        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid name. ");
            return initRescuer();
        }
    }

    private void nameAnimal() {
        System.out.println("Please name the rescued animal. ");
        Scanner scanner = new Scanner(System.in);
        try {
            //storing name for either a dog or a cat in chosenNameAnimal variable
            chosenNameAnimal = scanner.nextLine();

        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid name. ");
            nameAnimal();
        }
    }

    private void initAnimal() {

        System.out.println("What type of animal would you like to rescue? \n1. Dog \n2. Cat");
        Scanner scanner = new Scanner(System.in);
        try {
            animalType = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You have to choose a number, try again");
            initAnimal();
        }
        if (animalType == 1) {
            int Happiness = 5;
            int Hunger = 7;
            int randomHealth = (int) (Math.random() * 10 + 1);
            int randomAge = (int) (Math.random() * 10 + 1);

            animal = new Dog();
            animal.setHappiness(Happiness);
            animal.setHungerLevel(Hunger);
            animal.setHealth(randomHealth);
            animal.setAge(randomAge);
            animal.setFavoriteFood("Bones");
            animal.setName(getChosenNameAnimal());
            animal.setFavoriteActivity("Fetch");

            System.out.println("Dog's name is: " + animal.getName());
            System.out.println(animal.getName() + "' s favorite food is: " + animal.getFavoriteFood());
            System.out.println("Dog's favorite activity is: " + animal.getFavoriteActivity());
            System.out.println("He is: " + animal.getAge() + " years old. ");
            System.out.println("Health level for " + animal.getName() + " is: " + animal.getHealth() + "/10");
            System.out.println("Hunger level for " + animal.getName() + " is: " + animal.getHungerLevel() + "/10");
            System.out.println("Happiness for this dog is: " + animal.getHappiness() + "/10");

        } else {
            animal = new Cat();
            int HappinessCat = 5;
            int HungerCat = 7;
            int randomHealthCat = (int) (Math.random() * 10 + 1);
            int randomAgeCat = (int) (Math.random() * 10 + 1);

            animal.setHappiness(HappinessCat);
            animal.setHungerLevel(HungerCat);
            animal.setHealth(randomHealthCat);
            animal.setAge(randomAgeCat);
            animal.setFavoriteFood("Whiskas");
            animal.setName(getChosenNameAnimal());
            animal.setFavoriteActivity("Walking");

            System.out.println("Cat's name is: " + animal.getName());
            System.out.println(animal.getName() + "' s favorite food is: " + animal.getFavoriteFood());
            System.out.println("Cat's favorite activity is: " + animal.getFavoriteActivity());
            System.out.println("She is: " + animal.getAge() + " years old. ");
            System.out.println("Health level for " + animal.getName() + " is: " + animal.getHealth() + "/10");
            System.out.println("Hunger level for " + animal.getName() + " is: " + animal.getHungerLevel() + "/10");
            System.out.println("Happiness for this cat is: " + animal.getHappiness() + "/10");
        }

    }

    private List<Food> FoodList = new ArrayList<>();
    //private List<Food> catFoodList = new ArrayList<>();

    private void initFood() {
        if (animalType == 1) {
            Food food = new Food("Bones", 5, 5, 1);
            FoodList.add(food);
            Food food1 = new Food("Meat", 15, 10, 1);
            FoodList.add(food1);
        } else {
            Food food2 = new Food("Whiskas", 5, 5, 2);
            FoodList.add(food2);
            Food food3 = new Food("Beans", 15, 10, 2);
            FoodList.add(food3);
        }
    }

    private void showFood() {
        for (int i = 0; i <= FoodList.size(); i++) {
            if (i >= 0 && i <= 1) {
                System.out.println((i + 1) + ". " + FoodList.get(i).getName() + " (Price: " + FoodList.get(i).getPrice() + "$)");
            } else if (i > 1) {
                System.out.println((i + 1) + ". " + "Feed " + chosenNameAnimal + " later...");
            }
        }
    }


//    private void initCatFood() {
//        Food food = new Food("Beans", 5, 10, "Yes");
//        catFoodList.add(food);
//        Food food2 = new Food("Sticks", 2, 8, "No");
//        catFoodList.add(food2);
//        for (int i = 0; i <= catFoodList.size(); i++) {
//            if (i >= 0 && i <= 2) {
//                System.out.println((i + 1) + ". " + catFoodList.get(i).getName());
//            } else if (i > 2) {
//                System.out.println((i + 1) + ". " + "Feed the cat later...");
//            }
//        }
//    }


    private void requireFeeding() {

        System.out.println("It's time to feed your pet.");
        showFood();
        int x = rescuerChoice();
        if (x == 2) {
            System.out.println("You have chosen not to feed your pet. ");
            animal.setHungerLevel(animal.getHungerLevel() + 1);
            System.out.println("Hunger level increased: " + animal.getHungerLevel() + "/10");
            return;
        }
        if (rescuer.getMoneyAvailable() >= FoodList.get(x).getPrice()) {
            rescuer.setMoneyAvailable(rescuer.getMoneyAvailable() - FoodList.get(x).getPrice());
            rescuer.feed(animal, FoodList.get(x));
            System.out.println("Remaining budget: " + rescuer.getMoneyAvailable() + "$");
        } else {
            System.out.println("Not enough money to feed " + animal.getName() + " with " + FoodList.get(x).getName());
            requirePlaying();
        }
    }

    private int rescuerChoice() {
        Scanner scanner = new Scanner(System.in);
        int x;
        try {
            x = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid number. Try again. ");
            return rescuerChoice();
        }
        if (x > 3 || x < 1) {
            System.out.println("Invalid choice");
            return rescuerChoice();
        }
        return x - 1;
    }


    private RecreationalActivity[] recreationalArray = new RecreationalActivity[4];

    public void activitiesArray() {
        for (int i = 0; i < recreationalArray.length; i++) {
            System.out.println((i + 1) + ". " + recreationalArray[i].getName() + " (Price: " + recreationalArray[i].getCost() + "$)");
        }
    }

    private void initActivities() {
        RecreationalActivity recreationalActivity = new RecreationalActivity("Fetch", 1);
        recreationalArray[0] = recreationalActivity;
        RecreationalActivity recreationalActivity1 = new RecreationalActivity("Pet", 2);
        recreationalArray[1] = recreationalActivity1;
        RecreationalActivity recreationalActivity2 = new RecreationalActivity("Walking", 10);
        recreationalArray[2] = recreationalActivity2;
        RecreationalActivity recreationalActivity3 = new RecreationalActivity("Camping", 20);
        recreationalArray[3] = recreationalActivity3;
    }

    private int rescuerActivityChoice() {
        Scanner scanner = new Scanner(System.in);
        int x;
        try {
            x = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Try again");
            return rescuerActivityChoice();
        }
        if (x > 4 || x < 1) {
            System.out.println("Invalid choice");
            return rescuerActivityChoice();
        }
        return x;
    }

    private void requirePlaying() {
        System.out.println("Play with your pet: ");
        activitiesArray();
        int x;
        x = rescuerActivityChoice();
        if (rescuer.getMoneyAvailable() >= recreationalArray[x - 1].getCost()) {
            rescuer.play(animal, recreationalArray[x - 1]);
            rescuer.setMoneyAvailable(rescuer.getMoneyAvailable() - recreationalArray[x - 1].getCost());
            System.out.println("Remaining budget: " + rescuer.getMoneyAvailable() + "$");
        } else {
            System.out.println("Not enough money to play this activity. ");
            requireFeeding();
        }
    }

    public Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(Rescuer rescuer) {
        this.rescuer = rescuer;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    public String getChosenNameAnimal() {
        return chosenNameAnimal;
    }

    public void setChosenNameAnimal(String chosenNameAnimal) {
        this.chosenNameAnimal = chosenNameAnimal;
    }

    public int getAnimalType() {
        return animalType;
    }

    public void setAnimalType(int animalType) {
        this.animalType = animalType;
    }
}
