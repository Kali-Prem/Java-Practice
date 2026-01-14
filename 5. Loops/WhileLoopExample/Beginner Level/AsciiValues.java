/*
 Question:
 Write a Java program to print ASCII values
 of characters A to Z using a while loop.
*/

public class AsciiValues {
    public static void main(String[] args){
        char ch = 'A';
        while (ch <= 'Z'){
            System.out.println(ch);
            ch++;
        }
    }
}