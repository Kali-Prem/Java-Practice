/*
 Question:
 Write a Java program to print the first N natural numbers
 using a for loop.
*/

public class FirstNNaturalNumbers {
    public static void main(String[] args) {
        int N = 10;

        // Using a for loop to print the first N natural numbers
        for (int i = 1; i <= N; i = i + 1) {
            System.out.println(i);
        }
    }
}