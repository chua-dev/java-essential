package com.polymorphism.computer;

public class Main {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.openOperatingSystem();

        PersonalComputer com = new PersonalComputer();
        com.openOperatingSystem();

        AppleMacintosh mac = new AppleMacintosh();
        mac.openOperatingSystem();
        // Method Overloading allow a class to have more than one method with same name, given that their argument list are different.
        mac.typeIn();
        mac.typeIn("Yes its a string");
        mac.typeIn(10);
    }
}
