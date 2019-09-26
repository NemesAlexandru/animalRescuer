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
public void showMood () {
if (getHappiness() > 5) {
    System.out.println("Dog " + getName() + "'s happiness level is: " + getHappiness() + "/10.");
    System.out.println("Dog wags his tail. He is happy.");

}
else {
    System.out.println("Dog " + getName() + "'s happiness level is: " + getHappiness() + "/10.");
    System.out.println("Dog is sad now. You should play some activities with him.");
}
}


}
