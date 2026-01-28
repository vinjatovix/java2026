package com.vinjadevix.lesson04;

class Animal {
    String name;
    int age;

    void run() {
        System.out.printf("%s is %d years old and is running.%n", name, age);
    }


}

public class Objects {
    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.name = "Rex";
        dog.age = 5;
        dog.run();

        Animal cat = new Animal();
        cat.name = "Misha";
        cat.age = 3;
        cat.run();

    }
}
