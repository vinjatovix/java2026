package com.vinjadevix.lesson11;

public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory();
        factory.design();
        factory.build();

        Car car = new Car();
        // Car inherits design() and build() methods from Factory
        car.design();
        car.build();

        // Car has its own brand() method
        car.brand();

        // Access modifiers: public, protected, default (package-private), private
        // Public: accessible from anywhere
        // Protected: accessible within the same package and subclasses
        // Default: accessible only within the same package
        // Private: accessible only within the same class
    }
}
