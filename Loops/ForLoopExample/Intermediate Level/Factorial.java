/*
 Question:
 Write a Java program to find the factorial of a number
 using a for loop.
*/

public class Factorial {
    public static void main(String[] args) {
        int number = 5; 
        int factorial = 1;

        // Using a for loop to calculate the factorial
        for (int i = 1; i <= number; i = i + 1) {
            factorial *= i; // Equivalent to factorial = factorial * i
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
