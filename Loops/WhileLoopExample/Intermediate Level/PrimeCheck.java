/*
 Question:
 Write a Java program to check whether a number
 is prime using a while loop.
*/

public class PrimeCheck {
    public static void main(String[] args){
        int n = 11;
         int count = 0;
         int i = 1;
         while(i<= n){
             if(n % i == 0){
                 count++;
             }
             
             i++;
         }
         if(count == 2){
             System.out.print("Prime no");
         }
        else{
            System.out.print("Not Prime no");
        }
    }
}