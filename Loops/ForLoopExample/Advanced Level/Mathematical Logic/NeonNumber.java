/*
 Question:
 Write a Java program to check whether a number
 is a Neon number.

 Note:
 A Neon number is a number where the sum of digits
 of its square is equal to the number.
 Example: 9 → 9² = 81 → 8 + 1 = 9
*/


public class NeonNumber {
    public static void main(String[] args) {
         int number = 9;
         int sqr;
         sqr = number*number;    //9^2 = 81
         int digit;
         int sum = 0;
         
         for(int i = sqr; i > 0; i = i/10){
             digit = i % 10;
             sum = sum + digit;
         }
         if(sum == number){
             System.out.print("This is Neon Number");
         }
         else{
             System.out.print("Not Neon Number");
         }
         
    }
}