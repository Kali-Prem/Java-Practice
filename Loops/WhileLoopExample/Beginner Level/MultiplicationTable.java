/*
 Question:
 Write a Java program to print the multiplication
 table of a number using a while loop.
*/

public class MultiplicationTable {
    public static void main(String[] args){
        int n = 5;
        int i = 1;
        while( i<=10){
            int multi = n * i;
            System.out.println(n + " x " + i + " = " + multi);
            i++;
        }
    }
}