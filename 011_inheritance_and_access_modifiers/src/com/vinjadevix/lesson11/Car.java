package com.vinjadevix.lesson11;

// You can extend any class except final classes
// You can extend only one class (Java does not support multiple inheritance)
public class Car extends Factory {
    public void brand() {
        System.out.println("Opel");
    }


    @Override
    public void build() {
        System.out.println("Building a car");
    }
}
