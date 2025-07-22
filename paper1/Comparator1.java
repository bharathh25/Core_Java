package in.paper1;
import java.util.*;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class NameLengthComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.length() - s2.name.length();
    }
}

public class Comparator1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("John"));
        list.add(new Student("Alice"));
        list.add(new Student("Bob"));

        Collections.sort(list, new NameLengthComparator());

        System.out.println("Sorted by name length (Comparator): " + list);
    }
}


