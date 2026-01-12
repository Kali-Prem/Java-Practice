/*
 Question:
 Write a Java program to print numbers divisible by 5
 between 1 and 100 using a while loop.
*/

public class DivisibleByFive {
    public static void main(String[] args){
         int i = 1;
         while(i<=100){
            if(i%5==0){
                System.out.println(i);

            }
            i++;
         }
    }
}