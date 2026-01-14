/*
 Question:
 Write a Java program to find the sum of numbers
 from 1 to N using a while loop.
*/

public class SumOneToN {
    public static void main(String[] args){
        int n = 10;
        int i = 1;
        int sum = 0;
        while (i <= n ){
            sum = sum + i;
            i++;
        }
        System.out.print(sum);
    }
}