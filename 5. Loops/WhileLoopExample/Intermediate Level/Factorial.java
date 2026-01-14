/*
 Question:
 Write a Java program to find the factorial
 of a number using a while loop.
*/

public class Factorial {
    public static void main(String[] args){
        int n = 10;
        int i = 1;
        int fact = 1;
        
        while(i <= n){
            fact = fact * i;
            i++;

        }
    }
}