package com.day2.bharath;

/*
 
 Hospital System
Create the following class hierarchy:

Person class – name, age

Doctor class – specialization, extends Person

Patient class – illness, extends Person

Tasks:

Use constructor chaining with super()

Override a method showDetails() in both child classes

Print all details using overridden methods
 
 */

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void showDetails() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
}

class Doctor extends Person{
	String specialization;
	
	Doctor(String name, int age, String specialization){
		super(name,age);
		this.specialization=specialization;
	}
	
	@Override
	void showDetails() {
		super.showDetails();
		System.out.println("Specialization : "+specialization);
	}	
}

class Patient extends Person{
	String illness;
	
	Patient(String name, int age,String illness){
		super(name,age);
		this.illness=illness;
		
	}
	
	@Override
	void showDetails() {
		super.showDetails();
		System.out.println("Illness : "+illness);
	}
}
public class HospitalSystem {
	public static void main(String[] args) {
		Doctor d = new Doctor("Maddy",31,"Neurology");
		Patient p = new Patient("Sid",29,"Migraine");
		
		System.out.println("Doctor's Details :");
		d.showDetails();
		
		System.out.println("--------------------");
		
		System.out.println("Patient's Details :");
		p.showDetails();
	}
}
