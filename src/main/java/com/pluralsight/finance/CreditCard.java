package com.pluralsight.finance;

import com.pluralsight.assets.Valuable;

public class CreditCard implements Valuable, Comparable<Valuable> {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void charge(double amount){
        balance += amount;
    }

    public void pay(double amount) {
        balance -= amount;
    }

    public double getValue(){
        return -balance;
    }

    @Override
    public int compareTo(Valuable o) {
        return Double.compare(this.getValue(), o.getValue());
    }
}
