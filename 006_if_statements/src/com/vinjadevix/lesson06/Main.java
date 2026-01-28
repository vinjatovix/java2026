package com.vinjadevix.lesson06;

public class Main {
    public static void main(String[] args) {
        int firstNumber = (int) (Math.random() * 10) + 1;
        int secondNumber = (int) (Math.random() * 10) + 1;

        boolean isFirstNumberGreater = firstNumber > secondNumber;
        boolean isFirstNumberNotGreaterButDiffers = firstNumber != secondNumber;
        boolean isEqualResult = firstNumber == secondNumber;


        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);


        if (isFirstNumberGreater) {
            System.out.println("The first number is greater than the second number.");
        } else if (isFirstNumberNotGreaterButDiffers) {
            System.out.println("The second number is greater than the first number.");
        } else {
            System.out.println("Equal result: " + isEqualResult);
        }

    }
}
