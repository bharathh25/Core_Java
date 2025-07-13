package com.day4.bharath;

interface Payment{
	void pay(double amount);
}

class CreditCardPayment implements Payment{
	public void pay(double amount){
		System.out.println("Amount of Rs."+amount+" was paid through Credit card !!!");
	}
}

class UPIPayment implements Payment{
	public void pay(double amount){
		System.out.println("Amount of Rs."+amount+" was paid through UPI !!!");
	}
}

class CashPayment implements Payment{
	public void pay(double amount){
		System.out.println("Amount of Rs."+amount+" was paid through Cash !!!");
	}
}

public class PaymentSystem {
	public static void main(String[] args) {
		Payment p;
		
		p= new CreditCardPayment();
		p.pay(5110.2);
		
		p= new UPIPayment();
		p.pay(2506.2);
		
		p= new CashPayment();
		p.pay(1000);
	}

}
