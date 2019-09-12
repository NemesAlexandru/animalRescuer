package org.fasttrackit;

public class Fetch extends RecreationalActivity {
    private int happinessGain;
    private int cost;

    public Fetch(int happinessGain, int cost) {
        super("Fetch");
        this.happinessGain = happinessGain;
        this.cost = cost;
    }

    public int getHappinessGain() {
        return happinessGain;
    }

    public void setHappinessGain(int happinessGain) {
        this.happinessGain = happinessGain;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
