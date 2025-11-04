package com.pluralsight;

import com.pluralsight.assets.Gold;
import com.pluralsight.assets.House;
import com.pluralsight.assets.Jewelry;
import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.CreditCard;

import java.util.Scanner;

public class FinanceApplication {
    static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        FinanceApplication application = new FinanceApplication();

        Portfolio portfolio = new Portfolio("My Portfolio", application.getInput(scanner,"What is your name? "));

        while (true)
        {
            application.displayMenu();
            String assetType = application.getInput(scanner, "Enter Corresponding Number: ");

            switch (assetType){
                case "1":
                    application.addHouse(portfolio);
                    break;
                case "2":
                    application.addGold(portfolio);
                    break;
                case "3":
                    application.addJewelry(portfolio);
                    break;
                case "4":
                    application.addBankAccount(portfolio);
                    break;
                case "5":
                    application.addCreditCard(portfolio);
                    break;
                case "6":
                    System.out.println(portfolio.getLeastValuable());;
                    break;
                case "7":
                    System.out.println(portfolio.getMostValuable());;
                    break;
                case "8":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Error. Try again.");
            }
        }
    }

    private void addCreditCard(Portfolio portfolio) {
        String name = getInput(scanner, "Institution Name: ");
        String accountNumber = getInput(scanner,"Account Number: ");
        double balance = Double.parseDouble(getInput(scanner,"Balance: "));

        CreditCard creditCard = new CreditCard(name, accountNumber, balance);

        portfolio.add(creditCard);
    }

    private void addBankAccount(Portfolio portfolio) {
        String name = getInput(scanner,"Institution Name: ");
        String accountNumber = getInput(scanner,"Account Number: ");
        double balance = Double.parseDouble(getInput(scanner,"Balance: "));

        BankAccount bankAccount = new BankAccount(name, accountNumber, balance);

        portfolio.add(bankAccount);

    }

    private void addJewelry(Portfolio portfolio) {
        String name = getInput(scanner,"Item Type: ");
        double value = Double.parseDouble(getInput(scanner,"Value: "));
        double karats = Double.parseDouble(getInput(scanner,"Karats: "));

        Jewelry jewelry = new Jewelry(name, value, karats);

        portfolio.add(jewelry);
    }

    private void addGold(Portfolio portfolio) {
        String name = getInput(scanner,"Item Type: ");
        double value = Double.parseDouble(getInput(scanner,"Value: "));
        double weight = Double.parseDouble(getInput(scanner,"Weight: "));

        Gold gold = new Gold(name, value, weight);

        portfolio.add(gold);
    }

    private void addHouse(Portfolio portfolio) {
        String name = getInput(scanner, "Property Name: ");
        double value = Double.parseDouble(getInput(scanner,"Property Value: "));
        int yearBuilt = Integer.parseInt(getInput(scanner,"Year Built: "));
        int squareFeet = Integer.parseInt(getInput(scanner,"Square feet: "));
        int bedrooms = Integer.parseInt(getInput(scanner,"Bedrooms: "));

        House house = new House(name, value, yearBuilt, squareFeet, bedrooms);

        portfolio.add(house);

    }

    public void displayMenu(){
        String menu =  """
                Select from the following menu:
                1) Add House
                2) Add Gold
                3) Add Jewelry
                4) Add Bank Account
                5) Add Credit Card
                6) View least valuable asset
                7) View most valuable asset
                8) Exit
                """;


        System.out.println(menu);
    }

    public String getInput(Scanner scanner, String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
