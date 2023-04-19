package com.scaler.lld.oop.basics;

public class App {
    public static void main(String[] args) {
        BankAccount source = new BankAccount(1,"Alice",500);
        BankAccount destination = new BankAccount(2,"Bob",1000);

        source.transfer(500, destination);
        System.out.println("Balance in Alice : "+source.getBalance());
        System.out.println("Balance in Bob : "+destination.getBalance());
    }
}

