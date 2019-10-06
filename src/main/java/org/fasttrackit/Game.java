package org.fasttrackit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Game {

    private Rescuer rescuer;
    private Dog dog;
    private Dog dog1;
    private Cat cat;
    private Cat cat1;
    private Veterinarian veterinarian;

    private List<Food> animalFoodList = new ArrayList<>();
    private RecreationalActivity[] recreationalArray = new RecreationalActivity[4];

    public void start() {
        initFood();
        initActivities();
        foodList();
        activitiesArray();
    }

    public void foodList() {
        System.out.println("Available food for your pet: ");
        for(int i = 0; i<animalFoodList.size(); i++) {
            System.out.println(animalFoodList.get(i).getName());
        }
    }

    public void activitiesArray() {
        System.out.println("Activities available for your pet are: ");
        for (int i = 0; i< recreationalArray.length; i++) {
            System.out.println(recreationalArray[i].getName());
        }
    }

    private void initFood() {
        Food food = new Food("Gaspacio", 2.4, 10,"Yes", LocalDate.now());
        animalFoodList.add(food);
        Food food1 = new Food("Whiskas", 12, 8, "No", LocalDate.now());
        animalFoodList.add(food1);
    }

    private void initActivities() {
        RecreationalActivity recreationalActivity = new RecreationalActivity("Fetch");
        recreationalArray[0] = recreationalActivity;
        RecreationalActivity recreationalActivity1 = new RecreationalActivity("Pet");
        recreationalArray[1] = recreationalActivity1;
        RecreationalActivity recreationalActivity2 = new RecreationalActivity("Walking");
        recreationalArray[2] = recreationalActivity2;
        RecreationalActivity recreationalActivity3 = new RecreationalActivity("Camping");
        recreationalArray[3] = recreationalActivity3;
    }

    public Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(Rescuer rescuer) {
        this.rescuer = rescuer;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

}
