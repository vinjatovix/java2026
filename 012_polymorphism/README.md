# Lesson 12 \- Polymorphism in Java

## Overview
This lesson demonstrates runtime polymorphism (method overriding) in Java. A subclass (`Car`) overrides a method from its superclass (`Vehicle`) and adds its own behavior. The program shows how the actual object type, not the reference type, determines which overridden method runs.

## Files
1. `App.java` \- contains `main` that creates `Vehicle` and `Car` instances and exercises polymorphic behavior.  
2. `Vehicle.java` \- superclass that defines `design()` with a default implementation.  
3. `Car.java` \- subclass that overrides `design()` (annotated with `@Override`) and adds `ride()`.

## Key concepts
1. Polymorphism (runtime dispatch): overridden methods are resolved at runtime based on the object's actual class.  
2. Reference type vs actual object type: the compiler checks what methods are available on the reference type; the JVM chooses the implementation based on the object's class.  
3. Overriding: use `@Override` to make intent explicit and catch signature errors.  
4. Casting and `instanceof`: to call subclass-only methods from a superclass reference, first check with `instanceof` and then cast safely.

## What this program demonstrates
1. Creating a `Vehicle` and a `Car`.  
2. Assigning a `Car` to a `Vehicle` reference (`Vehicle referencedCar = myCar;`).  
3. Calling `referencedCar.design()` executes `Car`'s overridden `design()` method (dynamic dispatch).  
4. Calling `myCar.ride()` calls the `Car`-specific method. Trying `referencedCar.ride()` would cause a compile\-time error because `Vehicle` does not declare `ride()`; to call it you must cast to `Car` after verifying `instanceof`.

## Best practices
1. Use `@Override` for overridden methods.  
2. Keep APIs on the reference type minimal and well documented.  
3. Prefer interfaces and composition when appropriate to reduce tight coupling.  
4. Use `instanceof` + cast only when necessary; design interfaces to avoid frequent casting.