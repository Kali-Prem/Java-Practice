/*
 Question:
 Write a Java program to count numbers from 1 to N
 using a for loop.
*/

public class CountNumbers {
    public static void main(String[] args) {
        int N = 10; // You can change this value to count up to a different number
        int count = 0;

        // Using a for loop to count numbers from 1 to N
        for (int i = 1; i <= N; i = i + 1) {
            count = count+1;
            
        }
        System.out.println(count);
    }   
}