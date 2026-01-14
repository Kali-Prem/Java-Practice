/*
 Question:
 Write a Java program to find the sum of numbers
 from 1 to N using a for loop.
*/

public class SumOneToN {
    public static void main(String[] args) {
        int N = 100; 
        int sum = 0;

        // Using a for loop to calculate the sum of numbers from 1 to N
        for (int i = 1; i <= N; i = i + 1) {
            sum += i; // Equivalent to sum = sum + i
        }

        System.out.println("The sum of numbers from 1 to " + N + " is: " + sum);
    }
}


//Another way to do the same problem]

// public class SumOneToN {
//    public static void main(String[] args) {
//       int n = 100;
//       int sum = (n*(n+1)) / 2;
//     System.out.print(sum);
//    }
// }
