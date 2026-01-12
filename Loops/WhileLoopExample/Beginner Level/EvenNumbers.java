/*
 Question:
 Write a Java program to print even numbers
 from 1 to 50 using a while loop.
*/

public class EvenNumbers {
    public static void main(String[] args){
        int n = 1;
        while(n<=50){
            if(n%2 == 0){
                System.out.println(n);
            }
            n++;
        }
    }
}