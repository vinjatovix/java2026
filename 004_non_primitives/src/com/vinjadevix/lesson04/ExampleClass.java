package com.vinjadevix.lesson04;

public class ExampleClass {
    // This is an example of a non-primitive data type: a class
    String exampleField;

    // Constructor
    public ExampleClass(String exampleField) {
        this.exampleField = exampleField;
    }

    // Method
    public String getExampleField() {
        return exampleField;
    }



    // Additional methods and fields can be added here
    public void setExampleField (String exampleField) {
        this.exampleField = exampleField;
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        ExampleClass example = new ExampleClass("Hello, Non-Primitives!");
        System.out.println(example.getExampleField());
    }
}


