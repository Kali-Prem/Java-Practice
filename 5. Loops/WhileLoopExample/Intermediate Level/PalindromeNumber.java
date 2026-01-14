/*
 Question:
 Write a Java program to check whether a number
 is a palindrome using a while loop.
*/

public class PalindromeNumber {
    public static void main(String[] args){
        int n = 1231;
        int copy = n;
        int rev = 0;
        
        while(n>0){
            int digit = n % 10;
            rev = rev*10 + digit;
            n = n / 10;
        }
        if(copy == rev){
            System.out.print("Palindrome no");
        }
        else{
            System.out.print("Not Palindrome no");
        }
    }
}