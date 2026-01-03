/*
 Question:
 Write a Java program to print the multiplication table
 of a given number using a for loop.
*/

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 5; // You can change this number to print the table of any other number

        // Using a for loop to print the multiplication table
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

