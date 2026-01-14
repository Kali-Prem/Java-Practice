/*
 Question:
 Write a Java program to count the number of digits
 in a given number using a for loop.
*/

/*
public class CountDigits {
    public static void main(String[] args) {
        int number = 123456; // You can change this number to test with different inputs
        int count = 0;

        // Using a for loop to count the digits in the number
        for (int i = 1; i <= number; i = i * 10) {
            count++;
        }

        System.out.println("The number of digits in " + number + " is: " + count);
    }
} 
*/

// Another approach to count digits

public class CountDigits {
    public static void main(String[] args) {
        int number = 123456; 
        int count = 0;

        for(int i = number; i > 0; i = i / 10) {
            count++;
        }
        System.out.println("The number of digits in " + number + " is: " + count);
    }
}
