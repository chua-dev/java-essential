package com.polymorphism;

public class Dog extends Animal{
    String color;
    int age;

    @Override // Overriding Parent method
    public void sound() {
        System.out.println("Dog go Bark");
    }

}
