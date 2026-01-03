/*
 Question:
 Write a Java program to find the sum of even numbers
 from 1 to N using a for loop.
*/

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int N = 30; // You can change this value to compute sum up to a different number
        int sum = 0;

        // Using a for loop to calculate the sum of even numbers from 1 to N
        for (int i = 2; i <= N; i = i + 2) {
            sum += i; // Equivalent to sum = sum + i
        }

        System.out.println("The sum of even numbers from 1 to " + N + " is: " + sum);
    }
}