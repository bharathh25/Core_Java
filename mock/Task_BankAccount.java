package in.papers.mock;
/*
 * class BankAccount {
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
    	System.out.println("Account Holder Name : "+this.accountHolder+", Initial Balance : "+this.balance);
    	
    }
    
    void deposit(double amount) {
    	if(amount>0) {
    		balance = balance + amount;
    		System.out.println("Amount of Rs."+amount+" deposited successfully!!! New balance : Rs."+balance);
    	}
    	else {
    		System.out.println("Please enter a valid amount for deposit");
    	}
    }
    
    void withdraw(double amount) {
    	if(amount>0 && amount<balance) {
    		balance = balance - amount;
    		System.out.println("Amount of Rs."+amount+" is withdrawn successfully!!! New balance : Rs."+balance);
    	}
    	else {
    		System.out.println("Invalid Withdrawl!!!");
    	}
    }
    
}

public class Task_BankAccount {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("Bharath",25000);
		b1.deposit(40000);
		b1.withdraw(10000);
		
		System.out.println("----------------");
		
		BankAccount b2 = new BankAccount("Virat",50000);
		b2.deposit(40000);
		b2.withdraw(10000);
		
		System.out.println("----------------");
		
		BankAccount b3 = new BankAccount("Dhoni",50000);
		b3.deposit(0);
		b3.withdraw(10000000);
	}

}
