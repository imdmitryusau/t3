package com.company;

public class Engine {
    private double power;
    private int production_year;

    public Engine(double power, int production_year) {
        this.power = power;
        this.production_year = production_year;
    }
    public double getPower()
    {
        return power;
    }
    public int getProduction_year()
    {
        return production_year;
    }
    protected boolean isEco()
    {
        if (power>20000 && production_year>2000) return true;
        else return false;
    }
}
