package com.vinjadevix.lesson13;

// Encapsulation is the concept of restricting access to certain components of an object
// and only exposing a limited interface to the outside world.
// This is typically achieved using access modifiers (private, protected, public)
// Ensures that the internal representation of an object is hidden from the outside.
// This helps to maintain the integrity of the data and prevents unintended interference
// and misuse of the object's methods and properties.
// It also allows for better control over how the data is accessed and modified and reduces coupling
// between different parts of the code.

class Car {
    public static final int WHEELS = 4;
    private String model;

    private int calculateRevenue() {
        return 100000;
    }

    public String getRevenueInfo() {
        int revenue = calculateRevenue();
        return "The revenue is: " + revenue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Opel Astra");
        System.out.println("Car model: " + car.getModel());
        System.out.println(car.getRevenueInfo());

    }
}
