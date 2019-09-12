package org.fasttrackit;

public class Fetch extends RecreationalActivity {
    int happinessGain;
    int cost;

    public Fetch(int happinessGain, int cost) {
        super("Fetch");
        this.happinessGain = happinessGain;
        this.cost = cost;
    }
}
