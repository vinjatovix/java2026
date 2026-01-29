# Lesson 15 \- Interfaces in Java

## Overview
This lesson demonstrates how Java interfaces define contracts that unrelated classes can implement. The example shows how `Information` and `Refuel` interfaces are used by different classes and how interface references enable polymorphism.

## Files
- `Main.java` \- runs the demo and shows interface-based polymorphism and method passing.
- `Vehicle.java` \- implements `Information` and `Refuel`; provides `drive()`, `displayInformation()`, and `refuel()`.
- `Computer.java` \- implements `Information`; provides `start()` and `displayInformation()`.
- `Refuel.java` \- interface declaring `refuel()`.
- `Information.java` \- interface declaring `displayInformation()`.

## Key concepts
- Interface as a contract
  - Interfaces declare methods without implementation (unless `default`/`static` are used).
  - Any class that implements an interface must provide the declared methods.
- Multiple interface implementation
  - A class can implement multiple interfaces (e.g., `Vehicle implements Information, Refuel`).
- Polymorphism via interfaces
  - An interface reference can point to any implementing object (upcasting).
  - Calling a method on an interface reference invokes the implementing class's method.
- API design and decoupling
  - Use interfaces to program to an abstraction rather than a concrete class.
  - Methods can accept interface types to be flexible about accepted implementations.

## What this program demonstrates
- Creating `Computer` and `Vehicle` instances and calling their methods.
- Using `Information` and `Refuel` references to interact with implementing objects.
- Passing objects to a method that accepts an `Information` parameter (`showInformation`), demonstrating loose coupling.

## Best practices
- Prefer small, focused interfaces that represent a single capability.
- Program to interfaces in APIs to improve testability and flexibility.
- Document expected behavior and side\-effects of interface methods.
- Use `@FunctionalInterface` for single\-method interfaces intended for lambdas.
- Avoid adding methods to widely used interfaces unless necessary; prefer new interfaces or default methods with care.

## Notes
- Interfaces enable polymorphism without inheritance ties between classes.
- This lesson focuses on explicit method contracts and runtime dispatch through interface references.