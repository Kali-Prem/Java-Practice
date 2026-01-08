/*
 Question:
 Write a Java program to print numbers in
 alternating even-odd pattern.

 Output (N = 10):
 1 2 3 4 5 6 7 8 9 10
*/

public class AlternatingEvenOdd {
    public static void main(String[] args) {

        int n = 10;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}