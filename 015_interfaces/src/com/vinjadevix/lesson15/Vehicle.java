package com.vinjadevix.lesson15;

// A class can implement multiple interfaces
public class Vehicle implements Information, Refuel {
    private final String TYPE;
    double fuelLevel = 0.0;

    public Vehicle(String type) {
        this.TYPE = type;
    }

    public void drive() {
        System.out.println("The vehicle is driving");
    }

    @Override
    public void displayInformation() {
        System.out.println("Vehicle Type: " + TYPE);

    }

    @Override
    public void refuel() {
        fuelLevel += 10.0;
        System.out.println("Refueled vehicle. Current fuel level: " + fuelLevel + " liters.");

    }
}
