package com.vinjadevix.lesson16;

// Anonymous classes enable you to make your code more concise. They are ideal when making an instance of an object
// with certain "extras" such as overriding methods of a class or interface, without having to actually subclass a class.
// An anonymous class is a local class without a name. To create an anonymous class, you must use either a class or
// an interface as a base for the new class.
// Anonymous classes are defined and instantiated in a single statement using the new keyword.

interface Phone {
    void call();
}

class Computer {
    public void shutDown() {
        System.out.println("Shutting down the computer");
    }
}

public class Main {
    public static void main(String[] args) {

        Computer myComputer = new Computer();
        myComputer.shutDown();

        // Anonymous class that extends Computer
        Computer myAnonymousComputer = new Computer() {
            @Override
            public void shutDown() {
                System.out.println("Shutting down the anonymous computer");
            }
        };
        myAnonymousComputer.shutDown();

        // Anonymous class that implements Phone interface
        /*
        It's possible to use lambda expressions here because Phone is a functional interface
        Phone myAnonymousPhone = new Phone() {
            @Override
            public void call() {
                System.out.println("Calling from the anonymous phone");
            }
        };
        myAnonymousPhone.call();
        */

        // Using lambda expression for the functional interface Phone
        Phone myAnonymousPhone = () -> System.out.println("Calling from the anonymous phone");
        myAnonymousPhone.call();
    }
}
