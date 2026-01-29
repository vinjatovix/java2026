# Lesson 14 — Casting Numerical Values in Java

## Overview
This lesson demonstrates different kinds of type casting in Java: implicit (widening) conversions, explicit (narrowing) casts, and cases where casting can cause data loss or unexpected results. The examples are implemented in `Main.java`.

## Key concepts
- Implicit casting (widening)
  - Safe conversions from a smaller to a larger type (e.g., `int` → `double`) done automatically by the compiler.
- Explicit casting (narrowing)
  - Required when converting from a larger to a smaller type (e.g., `double` → `int`) using a cast operator, e.g., `(int) value`.
- Data loss and overflow
  - Narrowing conversions can truncate fractional parts or overflow integer ranges (e.g., converting large `long` to `int`, or `float` to `byte`).
- Char and int conversions
  - `char` can be cast to `int` to get its Unicode code point; an `int` can be cast to `char` to get the character with that code.
- Floating-point behavior
  - Converting between `float` and `double` can lose precision; very large or small values may be rounded or represented in scientific notation.
- Casting in arithmetic expressions
  - Casting affects evaluation (e.g., `(double) a / b` yields floating-point division).
- Casting negatives and extremes
  - Narrowing negative values behaves consistently with truncation toward zero; extreme values can overflow or saturate in unpredictable ways.
- Boolean conversions
  - Java does not allow casting between `boolean` and numeric types.

## What this program demonstrates
- Implicit conversion from `int` to `double`.
- Explicit narrowing from `double` to `int`, showing truncation.
- Truncation/overflow when casting `long` → `int` and `float` → `byte`.
- Conversion between `char` and `int`.
- Casting within arithmetic to obtain precise division results.
- Behavior with large/small/scientific notation values and notes about potential precision loss.
- Commented note that casting `boolean` to numeric types is not allowed.

## Example output (conceptual)
- Implicit casting (int to double): 100.0  
- Explicit casting (double to int): 9  
- Casting long to int (potential data loss): (truncated value)  
- Casting char to int: 65  
- Casting int to char: B  
- Casting float to byte (potential data loss): -126  
- Casting in arithmetic operation (int division to double): 2.5

## Best practices
- Prefer widening conversions when possible; avoid unnecessary narrowing.
- Validate values before narrowing casts to prevent unexpected overflow/truncation.
- Use explicit casts to make intent clear and to document potential data loss.
- Use appropriate types for required precision (e.g., `BigDecimal` for exact decimal arithmetic).
- Avoid relying on implicit conversions in complex expressions; cast explicitly where clarity matters.