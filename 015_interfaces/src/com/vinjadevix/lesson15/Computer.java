package com.vinjadevix.lesson15;


public class Computer implements Information {

    private final int SERIAL_NUMBER = (int) (Math.random() * 100000);

    public void start() {
        System.out.println("Computer is starting");
    }

    @Override
    public void displayInformation() {
        System.out.println("Computer Serial Number: " + SERIAL_NUMBER);

    }
}
