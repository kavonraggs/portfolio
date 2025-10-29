package com.pluralsight.assets;

public class Gold extends FixedAsset{
    private double weight;


    public Gold(String name, double value, double weight) {
        super(name, value);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }


}
