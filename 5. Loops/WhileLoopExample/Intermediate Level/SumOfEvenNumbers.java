/*
 Question:
 Write a Java program to find the sum of even numbers
 from 1 to N using a while loop.
*/

public class SumOfEvenNumbers {
    public static void main(String[] args){
        int n = 50;
        int i = 1;
        int sum = 0;
        while(i<= n){
            if(i%2==0){
                sum = sum + i;
            }
            i++;
        }
        System.out.print(sum);
    }
}