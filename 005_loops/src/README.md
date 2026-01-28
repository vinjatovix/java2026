# Lesson 5: Loops (Java)

This lesson demonstrates common loop constructs in Java and typical control-flow within loops using `05_loops/src/com/vinjadevix/lesson05/Main.java`.

What this example shows
- Basic `for` loop: counting iterations.
- Enhanced `for` (for-each) for arrays and collections.
- `while` loop with a sentinel condition.
- `do-while` loop (executes at least once).
- `break` and `continue` to control loop flow.
- Nested loops (example: multiplication table).
- Labeled `break` to exit an outer loop from an inner loop.
- Notes about infinite loops (examples commented out).

Key points
- Use `for` when the number of iterations is known or index is needed.
- Use enhanced `for` for cleaner iteration over arrays and collections.
- `while` checks the condition before each iteration; `do-while` checks after.
- `break` exits the current loop; `continue` skips to the next iteration.
- Labeled breaks can be used to exit multiple nested loops but use sparingly for readability.
- Avoid infinite loops unless you provide a clear exit (e.g., `break`, `return`, or I/O-driven termination).
