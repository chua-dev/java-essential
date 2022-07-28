package com.polymorphism;

public class Cat extends Animal{
    String color;
    @Override // Overriding Parent method
    public void sound() {
        System.out.println("Cat go Meow");
    }
}
