package com.day8.bharath;
/*
 *  Mini Task – Custom Exception
Create a custom exception class LowBalanceException.

In a BankAccount class, throw this exception when withdraw() is called with an amount greater than balance.

java
Copy code
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    int balance = 1000;

    void withdraw(int amount) throws LowBalanceException {
        if (amount > balance)
            throw new LowBalanceException("Insufficient funds!");
        else
            balance -= amount;
    }
}
Test this in main() by trying to withdraw 1500.
 */

class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    int balance = 1000;

    void withdraw(int amount) throws LowBalanceException {
        if (amount > balance)
            throw new LowBalanceException("Insufficient funds!");
        else
            balance -= amount;
    }
}

public class Bank {
	public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            account.withdraw(1500);
            System.out.println(account.balance);// trying to withdraw more than balance
        } catch (LowBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            account.withdraw(500);
            System.out.println(account.balance);// valid withdrawal
        } catch (LowBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

}
