package com.vinjadevix.lesson17;

import java.io.File;
import java.io.FileNotFoundException;
// import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // This is a relative path to the file simpleFile.txt
        // Path p = Paths.get(System.getProperty("user.dir"), "017_reading_files_with_scanner_class", "main", "resources", "simpleFile.txt");
        // File file = p.toFile();

        // If the file is in the project root directory, you can use:
        // File file = new File("simpleFile.txt");

        // Load `simpleFile.txt` from classpath (resources/)
        java.net.URL resource = Main.class.getClassLoader().getResource("simpleFile.txt");
        File file;

        if (resource != null) {
            try {
                file = Paths.get(resource.toURI()).toFile();
            } catch (java.net.URISyntaxException e) {
                file = new File(resource.getPath());
            }
        } else {
            // fallback to project root
            file = new File("simpleFile.txt");
        }

        try (Scanner textFile = new Scanner(file)) {
            while (textFile.hasNextLine()) {
                System.out.println(textFile.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found at: " + file.getAbsolutePath());
            e.printStackTrace();
        }

        // Suppose you want to read the fourth line of the file only
        try (Scanner textFile = new Scanner(file)) {
            int lineNumber = 0;
            while (textFile.hasNextLine()) {
                String line = textFile.nextLine();
                lineNumber++;
                if (lineNumber == 4) {
                    System.out.println("Fourth line: " + line);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found at: " + file.getAbsolutePath());
            e.printStackTrace();
        }
    }
}

// We can declare a throwable exception using the throws keyword in the method signature to avoid try-catch block
// public static void main(String[] args) throws FileNotFoundException {
//     Path p = Paths.get(System.getProperty("user.dir"), "017_reading_files_with_scanner_class", "simpleFile.txt");
//     File file = p.toFile();
//
//     Scanner textFile = new Scanner(file);
//     while (textFile.hasNextLine()) {
//         System.out.println(textFile.nextLine());
//     }
//     textFile.close();
// }
// Note: It's better to use try-with-resources statement to automatically close the Scanner

