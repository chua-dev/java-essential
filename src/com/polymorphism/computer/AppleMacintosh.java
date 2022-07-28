package com.polymorphism.computer;

public class AppleMacintosh extends Computer{

    @Override
    public void openOperatingSystem() {
        System.out.println("Macintosh MAC Operating System");
    }

    // Method Overloading represent same method with different type of params that produce different thing
    public void typeIn(){
        System.out.println("Mac receive empty typing");
    }
    public void typeIn(String s) {
        System.out.printf("Mac receive a string: %s", s);
    }

    public void typeIn(int number){
        System.out.printf("Mac receive a number: %d", number);
    }

}
