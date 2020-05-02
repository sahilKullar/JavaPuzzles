//A parent class named Account.
//
//        Inside it define:
//        a protected double member balance
//public void Withdraw(double amount)
//public void Deposit(double amount)
//public printBalance()
//        Then, there are two derived classes
//
//        Savings class
//has a private member interestRate set to 0.8
//        Withdraw(double amount) deducts amount from balance with interestRate
//        Deposit(float amount) adds amount in balance with interestRate
//        printBalance() displays the balance in the account
//        Current class
//Withdraw(double amount) deducts amount from balance
//        Deposit(double amount) adds amount in balance
//        printBalance() displays the balance in the account
//        Input #
//        In the Savings class, balance is set to 50000 in the parametrized constructor
//        In the Current class, balance is set to 50000 in the parametrized constructor

package com.puzzle;

public class Polymorphism_practise {

    public static void main(String[] args) {
        // creating savings account object
        Account SAccount = new Savings(50000);

        SAccount.Deposit(1000);
        SAccount.printBalance();

        SAccount.Withdraw(3000);
        SAccount.printBalance();

        System.out.println("-------");

        // creating current account object
        Account CAccount = new Current(50000);
        CAccount.Deposit(1000);
        CAccount.printBalance();

        CAccount.Withdraw(3000);
        CAccount.printBalance();
    }
}

class Account {
    protected double balance;

    public Account(double amount) {
        this.balance = amount;
    }

    public void Withdraw(double amount) {
    }

    public void Deposit(double amount) {
    }

    public void printBalance() {
    }
}

class Savings extends Account {
    private final double interestRate = 0.8;

    public Savings(double amount) {
        super(amount);
    }

    public void Withdraw(double amount) {
        balance -= amount + (amount * interestRate);
    }

    public void Deposit(double amount) {
        balance += amount + (amount * interestRate);
    }

    public void printBalance() {
        System.out.println(this.balance);
    }
}

class Current extends Account {

    public Current(double amount) {
        super(amount);
    }

    public void Withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public void Deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }
}