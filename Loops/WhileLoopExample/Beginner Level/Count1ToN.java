/*
 Question:
 Write a Java program to count numbers from 1 to N
 using a while loop.
*/

public class Count1ToN {
    public static void main(String[] args){
        int N = 10; // You can change this value to count up to a different number
        int i = 1;
        int count = 0;
        while(i<=N){
            count = count + 1;
            i++;
        }
        System.out.print(count);
    }
}