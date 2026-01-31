/*
 Question:
 Write a Java program to check whether a number
 is a Spy number.

 Note: Spy number :- Sum of digits = product of digits
*/


public class SpyNumber {
    public static void main(String[] args) {
        int n = 1124;
        int temp = n,copy = n;
        int sum = 0, product = 1;
        
        for(int i = temp; i>0; i = i /10){
            int digit = i % 10;
            product = product*digit;
        }
        for(int j = copy; j > 0; j = j/10){
            int last = j % 10;
            sum = sum + last;
        }
        if(sum == product){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }

    }
}