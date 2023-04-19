package com.scaler.lld.oop.basics;

public class BankAccount {

    // STATE

    private Integer id;
    private String name;
    private Integer balance;

    public BankAccount(Integer id, String name, Integer balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    // Behaviour

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void debit(Integer amount){
        this.balance-=amount;
    }
    public void credit(Integer amount){
        this.balance+=amount;
    }
    public void transfer(Integer amount ,BankAccount dest){
        this.debit(amount);
        dest.credit(amount);
    }
}

// Alice - Bank Account (1,"Alice",500)
// Bob -   Bank Account (2,"Bob",1000)
// Alice.debit(500)


// this.balance => 500
// Alice.transfer(Bob ,500)