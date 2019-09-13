package org.fasttrackit;

public class Dog extends Animal {
    private String tamingDifficulty;
    private String accommodationDifficulty;

    public Dog(String tamingDifficulty, String accommodationDifficulty) {
        super();
        this.tamingDifficulty = tamingDifficulty;
        this.accommodationDifficulty = accommodationDifficulty;
    }

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
}
