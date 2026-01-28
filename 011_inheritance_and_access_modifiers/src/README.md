# Lesson 11 — Inheritance and Access Modifiers in Java

## Overview
This lesson demonstrates basic class inheritance and Java access modifiers using three files in the same package: `Main.java`, `Factory.java`, and `Car.java`. It shows how a subclass inherits methods from a superclass and how access modifiers control visibility. It also demonstrates method overriding with the `@Override` annotation.

## Files
- `Factory.java` — a simple superclass that provides `design()` and `build()` methods.
- `Car.java` — a subclass that extends `Factory`, overrides one of the superclass methods (marked with `@Override`), and adds its own `brand()` method.
- `Main.java` — creates instances and calls inherited, overridden, and subclass methods to show behavior.

## Key concepts

- Inheritance
  - Use the `extends` keyword to create a subclass (`Car extends Factory`).
  - A subclass inherits non-private members (methods and fields) from its superclass.
  - Java supports single inheritance for classes. Use interfaces to achieve multiple type contracts.

- Method inheritance vs. overriding
  - Inherited methods can be used directly by the subclass (no code duplication).
  - Overriding occurs when the subclass defines a method with the same signature as a superclass method and provides a new implementation.
  - Use the `@Override` annotation on overridden methods to catch signature mistakes and make intent explicit. In this lesson `Car` overrides a superclass method and is annotated with `@Override`.

- Access modifiers
  - `public` — accessible from any other class.
  - `protected` — accessible in the same package and in subclasses.
  - (default) package-private — no modifier; accessible only within the same package.
  - `private` — accessible only within the defining class.
  - In this lesson the classes are in the same package, so package-private and protected members would be accessible to `Car` if present; `private` members would not.

- `final` classes and members
  - A `final` class cannot be extended.
  - A `final` method cannot be overridden.
  - Not used here, but important when designing inheritance hierarchies.

## What this program demonstrates
- Creating a `Factory` instance and calling its `design()` and `build()` methods.
- Creating a `Car` instance that:
  - Reuses inherited `Factory` behavior.
  - Provides a specialized implementation of a superclass method (overriding, annotated with `@Override`).
  - Adds its own `brand()` method.
- How calling the overridden method on a `Car` instance executes the subclass implementation.
- How inheritance promotes code reuse and specialization: `Car` specializes `Factory` by adding brand-specific behavior and customizing inherited behavior.

## Best practices
- Favor composition over inheritance when possible to reduce tight coupling.
- Keep fields `private` and expose behavior through methods.
- Use `@Override` when overriding superclass methods to catch mistakes and clarify intent.
- Minimize mutable shared state and prefer well-defined interfaces for reuse.
- Document intended extension points and consider `final` for classes/methods you don't want extended.