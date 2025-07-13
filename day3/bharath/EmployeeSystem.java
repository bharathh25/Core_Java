package com.day3.bharath;

/*
 * Create a system where:

Employee is a base class with method calculateSalary().

FullTimeEmployee and PartTimeEmployee extend it and override calculateSalary() differently.

java
Copy
Edit
Employee e;

// Use dynamic method dispatch:
e = new FullTimeEmployee();
e.calculateSalary();

e = new PartTimeEmployee();
e.calculateSalary();
✅ Implement all classes and use parent reference for child objects to test polymorphism.
 */

//Base class
class Employee {
 void calculateSalary() {
     System.out.println("Calculating salary for employee...");
 }
}

//Full-time employee class
class FullTimeEmployee extends Employee {
 @Override
 void calculateSalary() {
     int baseSalary = 50000;
     System.out.println("Full-Time Salary: $" + baseSalary);
 }
}

//Part-time employee class
class PartTimeEmployee extends Employee {
 @Override
 void calculateSalary() {
     int hoursWorked = 80;
     int hourlyRate = 20;
     int salary = hoursWorked * hourlyRate;
     System.out.println("Part-Time Salary: $" + salary);
 }
}

//Main class
public class EmployeeSystem {
 public static void main(String[] args) {
     Employee e;

     e = new FullTimeEmployee();   // Dynamic method dispatch
     e.calculateSalary();          // Calls FullTimeEmployee version

     e = new PartTimeEmployee();   // Dynamic method dispatch
     e.calculateSalary();          // Calls PartTimeEmployee version
 }
}
