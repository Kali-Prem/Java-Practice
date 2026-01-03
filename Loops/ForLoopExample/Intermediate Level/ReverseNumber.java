/*
 Question:
 Write a Java program to reverse a number
 using a for loop.
*/

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345; // You can change this number to reverse any other number
        int reversedNumber = 0;
        int digit;

        for(; number > 0; number = number / 10) {
            digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit;
        }
        System.out.print("Reversed Number: " + reversedNumber);
    }
}



/* Another way to do the same problem

public class ReverseNumber {
    public static void main(String[] args) {

        int number = 1234;
        int reverse = 0;

        for (int n = number; n != 0; n /= 10) {
            reverse = reverse * 10 + (n % 10);
        }

        System.out.println("Reversed number = " + reverse);
    }
}*/