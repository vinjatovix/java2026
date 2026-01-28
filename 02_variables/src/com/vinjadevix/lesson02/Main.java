package com.vinjadevix.lesson02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 2: Variables\n");

        // Declare and initialize variables
        int integerVar;
        integerVar = 42;
        System.out.println("Value of integerVar: " + integerVar);

        double doubleVar = 3.14159;
        System.out.println("Value of doubleVar: " + doubleVar + "\n");


        // Variable naming conventions
        int myVariable = 10; // camelCase
        final int CONSTANT_VAR = 100; // UPPER_SNAKE_CASE for constants
        System.out.println("myVariable: " + myVariable);
        System.out.println("CONSTANT_VAR: " + CONSTANT_VAR + "\n");
    }
}