# Lesson 6: If Statements (Java)

This lesson demonstrates basic conditional logic in Java using `if` / `else if` / `else`. The example generates two random integers (1..10), computes boolean flags for comparison, and prints a message depending on which condition is true.

What this example shows
- Generating random integers: `(int) (Math.random() * 10) + 1`.
- Using boolean expressions to capture conditions:
  - `firstNumber > secondNumber`
  - `firstNumber != secondNumber`
  - `firstNumber == secondNumber`
- `if` / `else if` / `else` branching to produce different output paths.
- Printing values and results with `System.out.println(...)`.

Key points
- Conditions are evaluated in order; the first true branch executes.
- Use clear boolean variable names to make conditional logic easier to read.
- `==` compares primitive values for equality; `!=` checks for inequality.
- When comparing multiple related conditions, structure branches to avoid unreachable code.

