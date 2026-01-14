/*
 Question:
 Write a Java program to demonstrate arithmetic operators
 such as addition, subtraction, multiplication, division,
 and modulus.
*/

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        // Addition
        int sum = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + product);

        // Division --- Perform integer division
        int quotient = a / b;
        System.out.println("Division: " + a + " / " + b + " = " + quotient);

        // Modulus----  Get the remainder of the division
        int remainder = a % b;
        System.out.println("Modulus: " + a + " % " + b + " = " + remainder);
    }
}