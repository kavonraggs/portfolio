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

    @Override
    public double getValue() {
        return super.getValue();
    }

    @Override
    public String toString() {
        return String.format("Gold [%s: %.2f oz |  Value: %.2f]", getName(), weight, getValue());
    }
}
