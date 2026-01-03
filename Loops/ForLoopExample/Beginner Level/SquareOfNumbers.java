/*
 Question:
 Write a Java program to print the square of numbers
 from 1 to 10 using a for loop.
*/

public class SquareOfNumbers {
    public static void main(String[] args) {
        // Using a for loop to print the square of numbers from 1 to 10
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("Square of " + i + " is " + (i * i));
        }
    }
}