package com.vinjadevix.lesson12;

public class App {
    public static void main(String[] args) {
        // Polymorphism: the ability of an object to take on many forms
        // In Java, polymorphism is achieved through method overriding and interfaces

        Vehicle myVehicle = new Vehicle(); // Create a Vehicle object
        Car myCar = new Car();         // Create a Car object (which is also a Vehicle)

        Vehicle referencedVehicle = myVehicle; // Vehicle reference to Vehicle object, are the same object

        // As Car is a Vehicle, we can assign a Car object to a Vehicle reference
        Vehicle referencedCar = myCar;         // Vehicle reference to Car object, are different objects

        referencedCar.design(); // In polymorphism, the method is not determined by the reference type, but by the actual object type
        myCar.ride();
        // referencedCar.ride(); This will cause a compile-time error, as the Vehicle class does not have a ride() method

        // The important thing is that when you call the method is the actual type of the method that decides which method to call,
        // but when you actually call the method is the object of the reference that decides which method is going to be called
    }
}
