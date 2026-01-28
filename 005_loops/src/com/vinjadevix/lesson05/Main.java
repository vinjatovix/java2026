package com.vinjadevix.lesson05;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Loops in Java: for, enhanced for, while, do-while, nested loops, break/continue\n");

        // basic for loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }
        System.out.println();

        // enhanced for (for-each) with array
        System.out.println("Enhanced for (array):");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int n : numbers) {
            System.out.println("Number: " + n);
        }
        System.out.println();

        // enhanced for (collection)
        System.out.println("Enhanced for (List):");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        for (String name : names) {
            System.out.println("Name: " + name);
        }
        System.out.println();

        // while loop with sentinel
        System.out.println("While loop (sentinel):");
        int count = 1;
        int limit = 5;
        while (count <= limit) {
            System.out.println("Count: " + count);
            count++;
        }
        System.out.println();

        // do-while always runs at least once
        System.out.println("Do-while loop:");
        int x = 6;
        do {
            System.out.println("This runs once even if condition false. x=" + x);
            x++;
        } while (x <= 5);
        System.out.println();

        // break and continue
        System.out.println("break and continue:");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                System.out.println("Breaking at " + i);
                break;
            }
            if (i % 2 == 0) {
                System.out.println("Skipping even " + i);
                continue;
            }
            System.out.println("Processing " + i);
        }
        System.out.println();

        // nested loops (multiplication table)
        System.out.println("Nested loops (multiplication table 1..5):");
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 5; b++) {
                System.out.print(a * b + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // labeled break to exit outer loop
        System.out.println("Labeled break:");
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i=" + i + " j=" + j);
                if (i * j == 4) {
                    System.out.println("Condition met, breaking outer loop");
                    break outer;
                }
            }
        }
        System.out.println();

        // infinite loop example (commented out)
        System.out.println("Infinite loop (commented):");
        System.out.println("for(;;) { ... } or while(true) { ... } - avoid unless you break/return.");
    }
}