/*
 Question:
 Write a Java program to print odd numbers
 from 1 to 50 using a for loop.
*/

public class OddNumbers {
    public static void main(String[] args) {
        // Using a for loop to print odd numbers from 1 to 50
        for (int i = 1; i <= 50; i = i + 2) {
            System.out.println(i);
        }
    }
}