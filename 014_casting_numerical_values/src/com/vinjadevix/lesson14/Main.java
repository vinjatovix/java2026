package com.vinjadevix.lesson14;

public class Main {
    public static void main(String[] args) {
        // Implicit casting (widening)
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit casting (int to double): " + doubleValue); // Outputs 100.0

        // Explicit casting (narrowing)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("Explicit casting (double to int): " + anotherIntValue); // Outputs 9

        // Casting with potential data loss
        long longValue = 123456789L;
        int castedIntValue = (int) longValue; // long to int
        System.out.println("Casting long to int (potential data loss): " + castedIntValue); // Outputs a truncated value

        // Casting char to int
        char charValue = 'A';
        int charToIntValue = (int) charValue; // char to int
        System.out.println("Casting char to int: " + charToIntValue); // Outputs 65

        // Casting int to char
        int intToCharValue = 66;
        char intToChar = (char) intToCharValue; // int to char
        System.out.println("Casting int to char: " + intToChar); // Outputs 'B'

        // Casting float to byte
        float floatValue = 130.5f;
        byte floatToByteValue = (byte) floatValue; // float to byte
        System.out.println("Casting float to byte (potential data loss): " + floatToByteValue); // Outputs -126 due to overflow

        // Casting byte to float
        byte byteValue = 100;
        float byteToFloatValue = (float) byteValue; // byte to float
        System.out.println("Casting byte to float: " + byteToFloatValue); // Outputs 100.0

        // Demonstrating casting with arithmetic operations
        int a = 5;
        int b = 2;
        double divisionResult = (double) a / b; // Cast to double for precise division
        System.out.println("Casting in arithmetic operation (int division to double): " + divisionResult); // Outputs 2.5

        // Casting with expressions
        double expressionValue = 7.9;
        int expressionToInt = (int) (expressionValue + 2.1); // double to int after addition
        System.out.println("Casting in expression (double to int): " + expressionToInt); // Outputs 10

        // Casting with negative values
        double negativeDoubleValue = -5.7;
        int negativeIntValue = (int) negativeDoubleValue; // double to int
        System.out.println("Casting negative double to int: " + negativeIntValue); // Outputs

        // Casting with large float value
        float largeFloatValue = 1.2e10f;
        long floatToLongValue = (long) largeFloatValue; // float to long
        System.out.println("Casting large float to long: " + floatToLongValue); // Outputs 12000000000

        // Casting with small double value
        double smallDoubleValue = 0.00012345;
        float doubleToFloatValue = (float) smallDoubleValue; // double to float
        System.out.println("Casting small double to float: " + doubleToFloatValue); // Outputs 1.2345E-4

        // Casting with scientific notation
        double sciDoubleValue = 3.4e38;
        float sciDoubleToFloatValue = (float) sciDoubleValue; // double to float
        System.out.println("Casting scientific notation double to float: " + sciDoubleToFloatValue); // Outputs 3.4E38

        // Casting with boolean (not allowed, just for demonstration)
        // boolean boolValue = true;
        // int boolToIntValue = (int) boolValue; // This will cause a compile-time error
    }
}
