package com.vinjadevix.lesson15;

public class Main {
    public static void main(String[] args) {

        // Computer and Vehicle are arbitrary classes which nothing in common,
        // but I decided that they should both have the same method that display information
        // about themselves. So I created an interface Information with method displayInformation
        // and made both classes implement this interface.
        Computer myComputer = new Computer();
        myComputer.start();
        myComputer.displayInformation();

        Vehicle myVehicle = new Vehicle("Car");
        myVehicle.drive();
        myVehicle.displayInformation();
        myVehicle.refuel();

        // Demonstrating polymorphism with interfaces
        // An interface reference can point to any object of a class that implements the interface
        // This is called upcasting
        // Here, we create an Information reference and assign it to a Vehicle object
        Information info = myVehicle; // Upcasting
        info.displayInformation();

        // Similarly, we can create a Refuel reference and assign it to a Vehicle object
        Refuel refuelable = myVehicle; // Upcasting
        refuelable.refuel();

        // Note: We cannot call methods that are not part of the interface using the interface reference
        // info.drive(); // This would cause a compile-time error
        // refuelable.drive(); // This would also cause a compile-time error


        // We can also pass objects of classes that implement the Information interface
        // to methods that accept Information type parameters
        showInformation(myComputer);
        showInformation(myVehicle);


    }

    private static void showInformation(Information info) {
        info.displayInformation();
    }
}
