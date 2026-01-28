package com.vinjadevix.lesson03;

public class Main {
    public static void main(String[] args){
        System.out.println("Primitive data types in Java:\n- Integers: byte, short, int, long");

        // byte (8 bits) minimum = -128, maximum = 127
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Byte range: " + minByte + " to " + maxByte);

        // short (16 bits) minimum = -32,768, maximum = 32,767
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Short range: " + minShort + " to " + maxShort);

        // int (32 bits) minimum = -2,147,483,648, maximum = 2,147,483,647
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Int range: " + minInt + " to " + maxInt);

        // long (64 bits) minimum = -9,223,372,036,854,775,808, maximum = 9,223,372,036,854,775,807
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Long range: " + minLong + " to " + maxLong + "\n");

        System.out.println("Long literals require an 'L' suffix, e.g., 123456789L\n");
        long exampleLong = 123456789L;
        System.out.println("Example long value: " + exampleLong + "\n");

        System.out.println("- Floating point: float, double");

        System.out.println("Note: Floating point types can represent very large and very small numbers, but with limited precision.");

        // float (32 bits)
        System.out.println("Note: Float.MIN_VALUE is the smallest positive non-zero value.");
        float minFloatPos = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        float minFloatNeg = -Float.MAX_VALUE;
        System.out.println("Float range (negative to positive): " + minFloatNeg + " to " + maxFloat +
                " (smallest positive: " + minFloatPos + ")\n");

        System.out.println("A float literal requires an 'f' suffix, e.g., 3.14f");
        float exampleFloat = 3.14f;
        System.out.println("Example float value: " + exampleFloat);

        // double (64 bits)
        System.out.println("Note: Double.MIN_VALUE is the smallest positive non-zero value.");
        double minDoublePos = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        double minDoubleNeg = -Double.MAX_VALUE;
        System.out.println("Double range (negative to positive): " + minDoubleNeg + " to " + maxDouble +
                " (smallest positive: " + minDoublePos + ")");

        // other types
        System.out.println("\n- Other types: char, boolean");

        // char (16 bits)
        char charVar = 'A';
        System.out.println("Char: " + charVar);
        System.out.println("Char must be enclosed in single quotes.\n");

        // boolean
        boolean booleanVar = true;
        System.out.println("Boolean: " + booleanVar);

    }
}
