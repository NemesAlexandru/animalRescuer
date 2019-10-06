package org.fasttrackit;

public class Cat extends Animal {
    private String tamingDifficulty;
    private String accommodationDifficulty;

    public String getTamingDifficulty() {
        return tamingDifficulty;
    }

    public void setTamingDifficulty(String tamingDifficulty) {
        this.tamingDifficulty = tamingDifficulty;
    }

    public String getAccommodationDifficulty() {
        return accommodationDifficulty;
    }

    public void setAccommodationDifficulty(String accommodationDifficulty) {
        this.accommodationDifficulty = accommodationDifficulty;
    }

    public void showMood () {
        if (getHappiness() > 5) {
            System.out.println("Cat " + getName() + "'s happiness level is: " + getHappiness() + "/10.");
            System.out.println("Cat purrs. She is happy.");

        }
        else {
            System.out.println("Cat " + getName() + "'s happiness level is: " + getHappiness() + "/10.");
            System.out.println("Cat is sad now. You should play some activities with her.");
        }
    }
}