/*
 Question:
 Write a Java program to check whether a number
 is a palindrome using a for loop.
*/

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        int reversedNumber = 0;
        int originalNumber = number;

        // Using a for loop to reverse the number
        for (; number > 0; number = number / 10) {
            reversedNumber = reversedNumber * 10 + (number % 10);
        }

        // Checking if the original number is equal to the reversed number
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}