package in.paper3;
//Static variable
class Student {
    int id;
    String name;
    static String college = "ABC College";  // static variable

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}

public class Q11 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "John");
        Student s2 = new Student(102, "Alice");
        Student.college="atria";
        s1.display();
        s2.display();
    }
}


