/*
 Question:
 Write a Java program to demonstrate
 implicit and explicit type casting.
*/
public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Type Casting
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value: " + intValue);
        System.out.println("Converted to Double: " + doubleValue);

        // Explicit Type Casting
        double anotherDoubleValue = 99.99;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double value: " + anotherDoubleValue);
        System.out.println("Converted to Integer: " + anotherIntValue);
    }
}