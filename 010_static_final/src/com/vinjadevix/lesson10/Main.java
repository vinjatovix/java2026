package com.vinjadevix.lesson10;

class Student {
    public static final String SCHOOL_NAME = "Greenwood High";
    public static String studentClass;
    private static int studentCount = 0;
    public String name;

    public Student() {
        studentCount++;
    }

    public static int getStudentCount() {
        return studentCount;
    }


    public static void classInfo() {
        System.out.println("Class from static method: " + studentClass);
        // Note: Static methods can only access static variables directly.
        // System.out.println("Name: " + name); // This would cause an error
    }

    public void studentName() {
        System.out.println(name);
        // Instance methods can access both instance and static variables
        System.out.println("Class: " + studentClass);
    }

}

public class Main {
    public static void main(String[] args) {

        Student.studentClass = "10th Grade";

        Student student1 = new Student();
        Student student2 = new Student();

        // total number of students
        System.out.println("Total Students: " + Student.getStudentCount());

        student1.name = "Alice";
        student2.name = "Bob";


        student1.studentName();
        student2.studentName();
        Student.classInfo();

        // Changing the static variable
        Student.studentClass = "11th Grade";

        System.out.printf("After changing class:%n");
        System.out.printf("Student 1: %s, Class: %s%n", student1.name, Student.studentClass);
        System.out.printf("Student 2: %s, Class: %s%n", student2.name, Student.studentClass);


        // A usage of static method would be for example Pi constant
        // System.out.printf("Value of Pi: %.5f%n", Math.PI);
        System.out.println(Student.SCHOOL_NAME);

        // A final static variable can't be changed after initialization
        // Student.SCHOOL_NAME = "New School"; // This would cause an error

    }
}
