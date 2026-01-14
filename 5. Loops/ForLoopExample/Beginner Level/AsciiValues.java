/*
 Question:
 Write a Java program to print ASCII values
 of characters from A to Z using a for loop.
*/

public class AsciiValues {
    public static void main(String[] args) {
        // Using a for loop to print ASCII values of characters from A to Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            int asciiValue = (int) ch;
            System.out.println("ASCII value of " + ch + " is " + asciiValue);
        }
    }
}