package com.polymorphism;

public class Main {
    public static void main(String[] args) {
        // Polymorphism - Method in the child class override a method in its parent class
        // Many form, polymorphism use those inherit attributes and method to perform different task

        Animal animal = new Animal();
        animal.sound();

        Cat c = new Cat();
        c.sound();

        Dog d = new Dog();
        d.sound();

        // Doesn't Override
        Mouse m = new Mouse();
        m.sound();
    }
}
