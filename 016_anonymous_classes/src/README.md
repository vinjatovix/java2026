Brief explanation: the following `README.md` explains the anonymous classes lesson demonstrated by `Main.java` — it
summarizes the example, key concepts, example output, and best practices.

# Lesson 16 \- Anonymous Classes in Java

## Overview

This lesson shows how to use anonymous classes in Java to create concise, one-off subclasses or implementations without
declaring a named class. The example in `Main.java` demonstrates an anonymous subclass of `Computer` and an anonymous
implementation of the `Phone` interface.

## Files

- `Main.java` \- contains the demo that:
    - Instantiates a `Computer` and calls its `shutDown()` method.
    - Creates an anonymous subclass of `Computer` that overrides `shutDown()`.
    - Creates an anonymous implementation of the `Phone` interface and calls `call()`.

## Key concepts

- Anonymous class
    - A local, unnamed class declared and instantiated in a single expression using `new`.
    - Can extend a concrete class or implement an interface.
    - Useful for short, specific behavior customizations (e.g., event handlers, callbacks).
- Syntax
    - `new SuperType() { /* override or implement methods here */ }`
- Scope and limitations
    - Cannot declare constructors (use instance initializer blocks if needed).
    - Can access effectively final local variables from the enclosing scope.
    - Produces a distinct class at runtime (with a compiler-generated name).

## What this program demonstrates

- Extending a class anonymously to override a method (`Computer` \- `shutDown()`).
- Implementing an interface anonymously (`Phone` \- `call()`).
- How the overridden method in the anonymous subclass is invoked instead of the superclass method.

## Best practices

- Use anonymous classes for small, focused overrides or simple interface implementations.
- Prefer lambdas (when applicable) for single-method interfaces (`@FunctionalInterface`).
- Avoid complex logic inside anonymous classes; extract a named class when behavior grows.
- Remember readability and testability when choosing anonymous classes over named classes.
