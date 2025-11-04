package com.pluralsight;

import com.pluralsight.assets.Valuable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets = new ArrayList<>();


    public Portfolio(String name, String owner){
        this.name = name;
        this.owner = owner;
    }


    public void add(Valuable asset){
        assets.add(asset);
    }

    public double getValue(){
        double totalValue = 0;
        for (Valuable valuable: assets){
            totalValue = totalValue + valuable.getValue();
        }
        return totalValue;
    }

    public Valuable getMostValuable(){
        if (!assets.isEmpty()) {
            return Collections.max(assets);
        }
        return null;
    }

    public Valuable getLeastValuable(){
        if (!assets.isEmpty()){
            return Collections.min(assets);
        }
        return null;
    }


}
