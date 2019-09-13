package org.fasttrackit;

public class Walking extends RecreationalActivity {
    private int happinessGain;
    private int cost;

    public Walking(int happinessGain, int cost) {
        super("Walking");
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
