/*
 Question:
 Write a Java program to print squares of numbers
 from 1 to 10 using a do-while loop.
*/

public class Squares {
    public static void main(String[] args) {
        int i = 1;
        do { 
            System.out.println(i*i);
            i++;
        } while (i<=10);
    }
}