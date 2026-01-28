package com.vinjadevix.lesson04;

public class Main {
    public static void main(String[] args) {
        System.out.println("Non-primitive data types in Java:\n- String, Arrays, Classes, Interfaces\n");

        // String
        String stringVar = "Hello, World!";
        System.out.println("String: " + stringVar);

        // String concatenation
        String greet = "Hello";
        String name = "Alice";
        String message = greet + ", " + name + "!";
        System.out.println("Concatenated String: " + message + "\n");

        // string methods
        String sample = "Java Programming";
        System.out.println("Original String: " + sample);
        System.out.println("Length: " + sample.length());
        System.out.println("Uppercase: " + sample.toUpperCase());
        System.out.println("Substring (5, 16): " + sample.substring(5, 16));
        System.out.println("Lowercase: " + sample.toLowerCase() + "\n");

        // string formatting
        int age = 25;
        String formattedString = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println("Formatted String: " + formattedString + "\n");

        // formatted string with printf
        System.out.printf("Using printf: My name is %s and I am %d years old.\n\n", name, age);


        // instance methods
        System.out.println("Using instance methods:");
        String instanceSample = new String("Instance Method Example");
        System.out.println("Original String: " + instanceSample);
        System.out.println("Replaced 'Example' with 'Demo': " + instanceSample.replace("Example", "Demo"));
        System.out.println("Index of 'Method': " + instanceSample.indexOf("Method") + "\n");

        // Array
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Array: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }

        // array methods
        System.out.println("\nArray Length: " + intArray.length);
        System.out.println("First Element: " + intArray[0]);
        System.out.println("Last Element: " + intArray[intArray.length - 1]);
        System.out.println("Element at index 2: " + intArray[2]);
        // adding or deleting an element to an array requires creating a new array
        int[] newArray = new int[intArray.length + 1];
        System.arraycopy(intArray, 0, newArray, 0, intArray.length);
        newArray[newArray.length - 1] = 6;
        System.out.print("New Array after adding an element: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        // modifying an element
        newArray[2] = 10;
        System.out.print("\nNew Array after modifying element at index 2: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }

        // multidimensional array
        int[][] multiArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("\n\nMultidimensional Array:");
        for (int[] ints : multiArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        // Note: Arrays have fixed size; to add/remove elements dynamically, use ArrayList or other collections.

        // ArrayList example
        System.out.println("\n\nUsing ArrayList for dynamic arrays:");
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("ArrayList: " + arrayList);
        arrayList.add(4);
        System.out.println("ArrayList after adding an element: " + arrayList);

        // deleting an element
        arrayList.remove(1); // removes element at index 1
        System.out.println("ArrayList after removing element at index 1: " + arrayList + "\n");


        // Class example        System.out.println("\nUsing a custom class:");
        ExampleClass example = new ExampleClass("Hello, Non-Primitives!");
        System.out.println("ExampleClass field: " + example.getExampleField());
        // Modify the field
        example.setExampleField("Updated Value");
        System.out.println("ExampleClass field after modification: " + example.getExampleField());


    }
}
