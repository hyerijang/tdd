package com.example.tdd.Bank;

public class Account {

    private int balance;

    public Account(int money) {
        this.balance = money;
    }

    public int getBalance() {
        return this.balance;
    }

    public void withdraw(int money) {
    this.balance -= money;
    }

    public void deposit(int money) {
        this.balance += money;
    }
}
