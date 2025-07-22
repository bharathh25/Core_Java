package in.paper1;
import java.util.*;

class Person implements Comparable<Person> {
    String name;

    Person(String name) {
        this.name = name;
    }

    // Compare alphabetically
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return name;
    }
}

public class Comprable1 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Charlie"));
        people.add(new Person("Alice"));
        people.add(new Person("Bob"));

        Collections.sort(people); // Uses compareTo()

        System.out.println("Sorted people: " + people);
    }
}
