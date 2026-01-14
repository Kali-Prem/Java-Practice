/*
 Question:
 Write a Java program to print even numbers
 from 1 to 50 using a for loop.
*/

public class EvenNumbers {
    public static void main(String[] args) {
        // Using a for loop to print even numbers from 1 to 50
        /*for (int i = 1; i <= 50; i = i + 1) {
            // Check if the number is even
            if (i % 2 == 0) {
                System.out.println(i);
            }
        } */
       
       // More efficient way to print even numbers
        
        for (int i = 2; i <= 50; i = i + 2) {
            System.out.println(i);
        }
    }
}

