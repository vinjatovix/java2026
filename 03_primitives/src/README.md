# Lesson 3: Primitive Types (Java)

This lesson demonstrates Java's primitive data types and how to inspect their ranges and basic usage via `System.out.println(...)`.

What this example shows
- Integer types and ranges: `byte`, `short`, `int`, `long` (uses `Type.MIN_VALUE` and `Type.MAX_VALUE`).
- Long literals require an `L` suffix (e.g., `123456789L`).
- Floating point types: `float`, `double`. Notes that `Float.MIN_VALUE` and `Double.MIN_VALUE` are the smallest positive non-zero values, and literals for `float` require an `f` suffix (e.g., `3.14f`).
- Character type: `char` (single quotes, 16-bit UTF-16 code unit).
- Boolean type: `boolean` (`true` or `false`).

Key points
- Use the wrapper constants (e.g., `Integer.MAX_VALUE`) to discover ranges.
- Use `L` for long literals and `f` for float literals to avoid loss of precision or compile errors.
- Floating point MIN_VALUE is not the most negative value but the smallest positive non-zero value.
- `char` values require single quotes and represent UTF-16 code units.
- `boolean` has only two values: `true` and `false`.

