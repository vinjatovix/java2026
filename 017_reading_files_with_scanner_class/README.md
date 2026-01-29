# Lesson 17 \- Reading files with `Scanner`

## Overview
This lesson shows how to read `simpleFile.txt` as a classpath resource using `Main.class.getResourceAsStream("/simpleFile.txt")` so the example works consistently from the IDE, build tools, and an executable jar.

## Files
- `src/com/vinjadevix/lesson17/Main.java` \- demonstration that loads `simpleFile.txt` from the classpath and reads it line\-by\-line.
- `simpleFile.txt` \- place this file under `src/main/resources` (or resources root) so it is bundled on the classpath.

## Key concepts
- Load resources from the classpath rather than relying on the JVM working directory.
- Place example files in `src/main/resources` (Maven/Gradle default) so they are available at runtime.
- Use `Main.class.getResourceAsStream("/simpleFile.txt")` to obtain an `InputStream` for the resource.
- Wrap the `InputStream` in a `Scanner` (or `BufferedReader`) and use try\-with\-resources to ensure proper closing.
- If a resource is missing, the call returns `null`; handle that case and report the attempted resource path.

## Troubleshooting
- Verify `simpleFile.txt` is located in `src/main/resources` (or another resources folder added to the classpath).
- Check the runtime classpath if running from a custom build or packaging.
- As a fallback for debugging, you can still construct a path from `System.getProperty("user.dir")`, but prefer classpath resources for portability.

## Best practices
- Prefer classpath resources for examples that must run from IDE, tests, and packaged jars.
- Document expected resource location in the README.
- Use try\-with\-resources and validate `getResourceAsStream` return value before reading.