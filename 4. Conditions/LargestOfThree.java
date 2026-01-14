/*
 Question:
 Write a Java program to find the largest of three numbers
 using if-else statements.
*/

public class LargestOfThree {
    public static void main(String[] args) {

        int a = 10;
        int b = 25;
        int c = 15;

        if (a >= b && a >= c) {
            System.out.println("Largest number: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number: " + b);
        } else {
            System.out.println("Largest number: " + c);
        }
    }
}


