/*
Question: Write a program to check if a given number is a prime number and all its digits are also prime numbers.

*/

import java.util.*;
class NumberAndDigitPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            boolean check = true;
            while (n != 0) {
                int rem = n % 10;
                if (rem == 0 || rem == 1 || rem == 4 || rem == 6 || rem == 8 || rem == 9) {
                    check = false;
                    break;
                }
                n = n / 10;
            }
            if (check == true) {
                System.out.print(true);
            } 
            else {
                System.out.print(false);
            }

        } 
        else {
            System.out.print(false);
        }
    }
}
