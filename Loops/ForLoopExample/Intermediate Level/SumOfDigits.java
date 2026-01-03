/*
 Question:
 Write a Java program to find the sum of digits
 of a number using a for loop.
*/

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;

        // Using a for loop to calculate the sum of digits
        for (; number > 0; number = number / 10) { // Remove the last digit
            sum = sum + (number % 10); // Add the last digit to sum and modulo operator gives the last digit
        }
        System.out.println("The sum of digits is: " + sum);
    }
}