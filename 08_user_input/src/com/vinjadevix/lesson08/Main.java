package com.vinjadevix.lesson08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.print("Enter your age: ");
        byte age = input.nextByte();
        System.out.println("You are " + age + " years old.");

        input.close();
    }
}
