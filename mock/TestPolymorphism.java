package in.papers.mock;
//Dynamic Polymorphism or Runtime Polymorphism
class Animal2 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal2 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat1 extends Animal2 {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal2 a;   // parent class reference

        a = new Dog1();  // Dog object
        a.sound();      // 🔁 Runtime: Dog barks

        a = new Cat1();  // Cat object
        a.sound();      // 🔁 Runtime: Cat meows
    }
}

