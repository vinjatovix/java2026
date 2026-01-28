# Lesson 10 — `static` and `final` in Java

## Overview
This lesson demonstrates the difference between class-level (`static`) members and instance-level members, how `static final` defines constants, and how constructors can update shared class state.

## Key concepts
- `static` variables
  - Belong to the class rather than to any single instance.
  - Shared by all instances: modifying a `static` field affects every instance.
  - Example concept: a shared `studentClass` value used by all `Student` objects.

- `static final` (constant)
  - A class constant that cannot be reassigned after initialization.
  - Use uppercase naming convention (e.g., `SCHOOL_NAME`).
  - Useful for values like mathematical constants or fixed metadata.

- `private static` with accessors
  - Encapsulate shared mutable state (e.g., a `studentCount`) as `private static` and expose it via a `public static` getter to control access.

- `static` methods
  - Operate on class-level data and can directly access only `static` members.
  - Cannot directly access instance fields or methods without an instance reference.

- Instance variables and instance methods
  - Belong to each object (e.g., a student's `name`).
  - Instance methods can access both instance and `static` members.

- Constructors
  - Run when an object is created.
  - Can modify class-level state (e.g., incrementing a shared `studentCount`).

## What this program demonstrates
- Setting a `static` class field before creating instances.
- Creating multiple `Student` instances and showing:
  - A shared counter of total students updated by the constructor.
  - Each instance having its own `name` while sharing `studentClass`.
- Calling a `static` method that prints class-level info.
- Changing a `static` variable after instances exist and showing the change reflected for all instances.
- Printing a `static final` constant (immutable).

## Example output (conceptual)
- Total Students: 2
- Each student's name printed
- Class printed from static method
- After changing the shared class, both instances show the updated class
- The school name printed as a constant

## Notes & best practices
- Use `static final` for constants and name them in uppercase.
- Minimize mutable `static` state to avoid surprising shared behavior and thread-safety issues.
- Prefer encapsulation: keep mutable `static` fields `private` and provide controlled accessors.
- Remember: `static` methods cannot access instance members directly.