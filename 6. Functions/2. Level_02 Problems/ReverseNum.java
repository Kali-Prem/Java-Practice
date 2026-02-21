// Question: Write a program to reverse a number using a function.


import java.util.*;
class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reverse(num);
        System.out.println(reverse(num)); 

    }

    public static int reverse(int num){
        int rev = 0;
        // for(int i = num; i > 0; i = i / 10){
        //     int digit = i % 10;
        //     rev = rev*10 + digit;
        // }

        while (num != 0) {
        rev = rev * 10 + num % 10;
        num /= 10;
        }
        return rev;

    }
}