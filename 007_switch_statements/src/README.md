# Lesson 7: Switch Statements (Java)

This lesson demonstrates using a `switch` statement on a `String` value. See `07_switch_statements/src/com/vinjadevix/lesson07/Main.java` for the example implementation.

What this example shows
- Switching on a `String` value (`order`) with `case` labels: `"Tea"`, `"Coffee"`, `"Juice"`.
- Use of `break` to prevent fall-through between cases.
- A `default` case to handle unexpected values.
- Note: switching on `String` has been supported since Java 7.
- Recommendation: for fixed sets (like menu items or days), prefer `enum` for type safety.

Key points
- The first matching `case` executes; without `break` execution continues into the next case (fall-through).
- `default` runs when no `case` matches.
- `String` comparisons in `switch` are effectively `equals` checks (case-sensitive).
- Use `enum` when values are known and limited to improve clarity and safety.
