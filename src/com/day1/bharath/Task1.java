package com.day1.bharath;

/*
 
 class BankAccount {
    String accountHolder;
    double balance;

    // Task:
    // - Create constructor
    // - deposit(double amount)
    // - withdraw(double amount)
    // - showBalance()
    // Create 2 accounts and perform operations
}

 */

class BankAccount {
	String accountHolder;
    double balance;
    
    BankAccount(String accountHolder,double balance){
    	this.accountHolder=accountHolder;
    	this.balance=balance;
    	System.out.println(this.accountHolder+"'s bank account is created with a balance of Rs."+this.balance);
    }
    
    void deposit(double amount) {
    	if(amount > 0) {
    		balance += amount;
    		System.out.println("Ammount of Rs."+amount+" deposited successfully!! Avbl balance "+balance);
    	}
    	else {
    		System.out.println("Invalid deposit!!!");
    	}
    }
    
    void withdraw(double amount) {
    	if(amount>0 && amount<=balance) {
    		balance -= amount;
    		System.out.println("Amount of Rs."+amount+" withdrawn successfully!!! Avbl balance "+balance);
    	}
    	else {
    		System.out.println("Invalid withdrawl!!!");
    	}
    }
    
    void showBalance() {
    	System.out.println("Total balance : "+balance);
    }
}
public class Task1 {
	
	public static void main(String[] args) {
		
		BankAccount b = new BankAccount("Virat Kohli",1000);
		b.deposit(200);
		b.withdraw(300);
		b.showBalance();
		
		BankAccount b1 = new BankAccount("Bharath",25000);
		b1.deposit(2900);
		b1.withdraw(5000);
		b1.showBalance();
		
	}

}
