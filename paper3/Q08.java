package in.paper3;
//Constructor Chaining

public class Q08 {
    String name;
    int age;

    // Constructor 1
    Q08() {
        this("John", 25); // Calls Constructor 2
        System.out.println("Default constructor called");
    }

    // Constructor 2
    Q08(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
    	Q08 p = new Q08(); // Starts constructor chaining
        p.display();
    }
}

