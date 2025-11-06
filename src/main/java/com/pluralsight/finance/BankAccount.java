package com.pluralsight.finance;

import com.pluralsight.assets.Valuable;

public class BankAccount implements Valuable, Comparable<Valuable> {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber,double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    @Override
    public double getValue(){
        return balance;
    }

    @Override
    public int compareTo(Valuable o) {
        return Double.compare(this.getValue(), o.getValue());
    }

    @Override
    public String toString() {
        return "Bank Account" +
                "\nBank name: " + name +
                "\nAccount Number: " + accountNumber +
                "\nBalance: " + balance;
    }
}
