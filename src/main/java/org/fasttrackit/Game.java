package org.fasttrackit;

public class Game {
    private Rescuer rescuer;
    private Dog dog;
    private Dog dog1;
    private Cat cat;
    private Cat cat1;
    private Veterinarian veterinarian;

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
