package com.jsank.corejavapractice.DSA;

abstract class Animal {
    protected abstract void sound();

    void eat() {
        System.out.println("Eating");
    }

    private void sleep() {
        System.out.println("Sleeping");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Bark");
    }

    void run() {
        System.out.println("Running");
    }
}

public class ObjectCreation {
    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound(); // Bark
        a.eat();   // Eating

        // a.run(); // Compile Error
        // a.sleep(); // Compile Error
    }
}
