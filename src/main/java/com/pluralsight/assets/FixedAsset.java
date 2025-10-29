package com.pluralsight.assets;

public abstract class FixedAsset implements Valuable, Comparable<Valuable> {
    private String name;
    private double marketValue;

    public FixedAsset(String name, double value){
        this.name = name;
        this.marketValue = value;

    }

    @Override
    public double getValue(){
        return getMarketValue();

    }

    public String getName() {
        return name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    @Override
    public int compareTo(Valuable o) {
        return Double.compare(this.getValue(), o.getValue());
    }

    @Override
    public String toString() {
        return String.format("%s (%.2f)", name, getValue());
    }
}
