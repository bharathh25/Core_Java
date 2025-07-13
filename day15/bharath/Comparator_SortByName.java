package com.day15.bharath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Comparator_SortByName {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(2, "Bob"));
        list.add(new Employee(1, "John"));
        list.add(new Employee(3, "Alice"));

        // Sort by name using lambda
        Collections.sort(list, (a, b) -> a.name.compareTo(b.name));

        for (Employee e : list)
            System.out.println(e.id + " " + e.name);
    }
}


