package com.day2.bharath;
/*
 class Employee {
    void work() {
        System.out.println("Employee works 8 hours");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager works 10 hours");
    }
}

public class Company {
    public static void main(String[] args) {
        // Create object of Manager
        // Call work() method
        // Try using polymorphism: Employee emp = new Manager();
    }
}

 
 */

class Employee {
    void work() {
        System.out.println("Employee works 8 hours");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager works 10 hours");
    }
}
public class MtdOvrdng {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.work();
		
		Employee e = new Manager();// Upcasting: Manager → Employee
		e.work();// Calls overridden method in Manager due to dynamic binding
		
		Employee e1 = new Employee();
		e1.work();//not overriden
	}
}
