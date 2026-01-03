/*
 Question:
 Write a Java program to find the sum of odd numbers
 from 1 to N using a for loop.
*/

/*
public class SumOfOddNumbers {
    public static void main(String[] args) {
        int N = 100; // You can change this value to compute sum up to a different number
        int sum = 0;

        // Using a for loop to calculate the sum of odd numbers from 1 to N
        for (int i = 1; i <= N; i = i + 2) {
            sum += i; // Equivalent to sum = sum + i
        }

        System.out.println("The sum of odd numbers from 1 to " + N + " is: " + sum);
    }
} */

// Another way to solve the same problem

public class SumOfOddNumbers {
    public static void main(String[] args) {

        int n = 20;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum of odd numbers = " + sum);
    }
}