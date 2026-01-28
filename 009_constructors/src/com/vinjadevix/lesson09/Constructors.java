package com.vinjadevix.lesson09;

class Program {
    int version;
    String name = "MyApp";

    public Program() {
        System.out.println("Program " + name + " started!");
        version = 1;
        System.out.println("Version: " + version);
    }

    public Program(int version) {
        this.version = version;
        System.out.println("Program " + name + " started!");
        System.out.println("Version: " + version);
    }


    public Program(String name, int version) {
        this.version = version;
        this.name = name;
        System.out.println("Program " + name + " started!");
        System.out.println("Version: " + version);
    }

    public Program(String name) {
        this(name, 1);
    }


}

public class Constructors {
    public static void main(String[] args) {
        Program program = new Program();
        Program programV2 = new Program(2);
        Program customProgram = new Program("CustomApp", 3);
        Program defaultVersionProgram = new Program("DefaultVersionApp");

    }
}
