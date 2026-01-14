/*
 Question:
 Write a Java program to check whether a number is
 positive, negative, or zero using if-else statements.
*/

public class IfElseExample {
    public static void main(String[] args) {

        int number = 10;

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
