package com.day15.bharath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.id - s.id;
    }
}

public class SortbyID {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "John"));
        list.add(new Student(1, "Alice"));
        list.add(new Student(2, "Bob"));

        Collections.sort(list); // uses compareTo

        for (Student s : list)
            System.out.println(s.id + " " + s.name);
    }
}


