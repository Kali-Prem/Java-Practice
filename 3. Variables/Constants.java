/*
 Question:
 Write a Java program to demonstrate the use of constants
 using the final keyword.
*/

public class Constants {
    public static void main(String[] args) {
        final double PI = 3.14159; // Declaring a constant
        final int MAX_USERS = 100; // Declaring another constant

        System.out.println("Value of PI: " + PI);
        System.out.println("Maximum number of users allowed: " + MAX_USERS);

        // Attempting to change the value of a constant will result in a compile-time error
    }
}