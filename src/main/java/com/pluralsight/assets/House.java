package com.pluralsight.assets;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double value, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, value);
        this.squareFeet = squareFeet;
        this.yearBuilt = yearBuilt;
        this.bedrooms = bedrooms;
    }




    @Override
    public double getValue(){

    }

}
