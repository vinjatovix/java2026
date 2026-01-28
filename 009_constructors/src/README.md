# Constructors Lesson

This lesson demonstrates Java constructors, overloaded constructors, and the use of `this` (both to access fields and to call other constructors).

## Files
- `09_constructors/src/com/vinjadevix/lesson09/Constructors.java` — contains the example `Program` class and a `main` that creates several instances.

## What is a constructor?
A constructor is a special method used to initialize new objects. It has the same name as the class and no return type. Constructors run when an object is created with `new`.

## Default and parameterized constructors
- A default (no-argument) constructor initializes an object with default values.
- Parameterized constructors accept arguments so you can initialize an object with specific values.

Example behaviors shown:
- `Program()` — default constructor sets a default `name` and `version`.
- `Program(int version)` — sets the `version` while using the default `name`.
- `Program(String name, int version)` — sets both `name` and `version`.

## Overloaded constructors
Overloading means defining multiple constructors with different parameter lists (different types or counts). The JVM chooses the constructor to call based on the arguments provided at object creation.

Benefits:
- Flexible initialization options.
- Cleaner instantiation code for different use cases.

## Using `this`
There are two common uses of `this` in constructors:
1. `this.field` — refers to the current object's field when a parameter has the same name (avoids shadowing).
2. `this(...)` — calls another constructor in the same class (constructor chaining). It must be the first statement in the constructor.

Example from the lesson:
- `public Program(String name) { this(name, 1); }` — calls the two-argument constructor to avoid duplicating initialization logic.

## Good practices
- Use constructor chaining (`this(...)`) to centralize initialization logic.
- Keep constructors lightweight; prefer factory methods if construction is complex.
- Use `this.field = parameter` to clarify assignment when names collide.

## Summary
This example shows how to create multiple constructors to support different initialization patterns and how to use `this` to keep code clear and avoid duplication.