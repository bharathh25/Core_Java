package com.day6.bharath;
/*
 * class Book {
    String title;
    int price;

    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    void showDetails() {
        System.out.println("Title: " + title + ", Price: " + price);
    }
}

public class Library {
    public static void main(String[] args) {
        // Task:
        // 1. Create an array of 3 Book objects
        // 2. Initialize each with different values
        // 3. Use for-each loop to print details
    }
}

 */

class Book {
    String title;
    int price;

    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    void showDetails() {
        System.out.println("Title: " + title + ", Price: " + price);
    }
}

public class ObjArray {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Java Programming", 450);
        books[1] = new Book("Python Basics", 500);
        books[2] = new Book("Data Structures", 600);
        
        for(Book b : books) {
        	b.showDetails();
        }
    }
}

