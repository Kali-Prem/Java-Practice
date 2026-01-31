/*
 Question:
 Write a Java program to check whether a number
 is a Palindrome Prime number.
 */

public class PalindromePrime {

    public static void main(String[] args) {
        int n = 131;
        int copy = n;
        int count = 0;

        //Prime number check
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            int rev = 0;
            while (copy > 0) {
                int digit = copy % 10; //last digit
                rev = rev * 10 + digit;
                copy = copy / 10;
            }
            if (rev == n) {
                System.out.println("Number is Palindrome Prime");
            } else {
                System.out.print(false);
            }

        } else {
            System.out.println(false);
        }

    }
}
