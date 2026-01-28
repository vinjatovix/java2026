package com.vinjadevix.lesson07;

public class Main {
    public static void main(String[] args) {
      String order = "Coffee";

        switch (order) {
            case "Tea":
                System.out.println("You ordered Tea.");
                break;
            case "Coffee":
                System.out.println("You ordered Coffee.");
                break;
            case "Juice":
                System.out.println("You ordered Juice.");
                break;
            default:
                System.out.println("Unknown order.");
                break;
        }

        // Variable types supported in switch statements: char, byte, short, int, String, and enum types.
    }

}
