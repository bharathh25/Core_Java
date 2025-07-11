package com.day5.bharath;

/*
 * class BankAccount {
    private String holderName;
    private double balance;

    public void setHolderName(String name) {
        this.holderName = name;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    // Task: Test all methods with valid and invalid data
}

 */

class BankAccount {
    private String holderName;
    private double balance;

    public void setHolderName(String name) {
        this.holderName = name;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    // Task: Test all methods with valid and invalid data
}


public class BankValidatio {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Set holder name
        account.setHolderName("Alice");

        // Test 1: Valid deposit
        account.deposit(1000);
        System.out.println("Balance after depositing Rs.1000: " + account.getBalance());  // Expected: 1000.0

        // Test 2: Invalid deposit (negative amount)
        account.deposit(-500);
        System.out.println("Balance after invalid deposit of Rs.-500: " + account.getBalance());  // Expected: 1000.0

        // Test 3: Valid withdrawal
        account.withdraw(400);
        System.out.println("Balance after withdrawing Rs.400: " + account.getBalance());  // Expected: 600.0

        // Test 4: Invalid withdrawal (negative amount)
        account.withdraw(-100);
        System.out.println("Balance after invalid withdrawal of Rs.-100: " + account.getBalance());  // Expected: 600.0

        // Test 5: Invalid withdrawal (more than balance)
        account.withdraw(1000);
        System.out.println("Balance after over-withdrawal of Rs.1000: " + account.getBalance());  // Expected: 600.0
    }
}

