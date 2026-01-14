/*
 Question:
 Write a Java program to print Fibonacci series
 up to 10 terms using a for loop.

 Example:
 0 1 1 2 3 5 8 ...
*/


public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);
        int sum;
        
        for(int i = 1; i <= 8; i = i+1){
            sum = a+b;
            System.out.print(" "+sum);
            a = b;
            b = sum;
        }
    }
}