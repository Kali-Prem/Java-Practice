/*
 Question:
 Write a Java program to print numbers divisible by 5
 between 1 and 100 using a for loop.
*/

public class DivisibleByFive {
    public static void main(String[] args) {
        // Using a for loop to print numbers divisible by 5 between 1 and 100
        for (int i = 1; i <= 100; i = i + 1) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}