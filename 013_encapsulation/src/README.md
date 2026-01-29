# Lesson 13 \- Encapsulation in Java

## Overview
This lesson demonstrates encapsulation: hiding an object's internal state and implementation details and exposing a limited, controlled interface. The example uses a `Car` class with private data and methods, public accessors, and a public constant.

## Files
- `Main.java` — creates a `Car` instance, sets the model, and prints model and revenue info.
- `Car` (in the same package) — shows encapsulation through private fields and methods plus public methods to access controlled information.

## Key concepts
- Private fields and methods
  - `model` is `private` so external code cannot modify it directly.
  - `calculateRevenue()` is `private` and encapsulates internal logic for computing revenue.
- Public accessors
  - `getModel()` and `setModel(String)` provide controlled access to the `model`.
  - `getRevenueInfo()` calls the private method and returns a user\-friendly string, exposing only what is needed.
- Constants
  - `public static final int WHEELS = 4;` shows how to expose immutable shared values.

## What this program demonstrates
- Encapsulation keeps implementation details (like revenue calculation) hidden and prevents external misuse.
- Public methods act as a stable API: callers use `setModel`, `getModel`, and `getRevenueInfo` without knowing internal details.
- Changing internal logic (for example, how revenue is computed) does not affect code that uses the public API.

## Best practices
- Keep fields `private` and expose behavior through methods.
- Validate inputs inside setters before assigning fields.
- Prefer returning immutable or defensive copies for internal collections.
- Use `private` methods to break complex logic into readable parts while keeping them hidden from clients.
- Use `public static final` for constants and name them in uppercase.

## Notes
- Encapsulation improves maintainability, enables safer refactoring, and reduces coupling between components.
