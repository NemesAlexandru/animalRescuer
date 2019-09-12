package org.fasttrackit;

public class Dog extends Animal {
    String tamingDifficulty;
    String accommodationDifficulty;

    public Dog(String tamingDifficulty, String accommodationDifficulty) {
        super("Rex");
        this.tamingDifficulty = tamingDifficulty;
        this.accommodationDifficulty = accommodationDifficulty;
    }
}
