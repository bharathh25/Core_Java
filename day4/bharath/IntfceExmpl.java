package com.day4.bharath;

/*
 * interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document...");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        // Create Printable reference for Document
        // Call print()
    }
}

 */
interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document...");
    }
}

public class IntfceExmpl {
    public static void main(String[] args) {
        // Create Printable reference for Document
        // Call print()
    	Printable p = new Document();
    	p.print();
    }
}


