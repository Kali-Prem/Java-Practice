/*
 Question:
 Write a Java program to find the sum of digits
 of a number using a while loop.
*/

public class SumOfDigits {
    public static void main(String[] args){
        int n = 12345;
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.print(sum);

    }
}