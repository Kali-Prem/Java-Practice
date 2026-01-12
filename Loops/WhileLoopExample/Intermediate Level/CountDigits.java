/*
 Question:
 Write a Java program to count the number of digits
 in a number using a while loop.
*/

public class CountDigits {
    public static void main(String[] args){
        int n = 3848385;
        int count = 0;
        while(n > 0){
            count++;
            n = n / 10;
            
        }
        System.out.print(count);
    }
}