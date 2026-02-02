
/*
 Question:
 Write a Java program to print numbers whose
 sum of digits is a prime number.

 Example:
 Number = 23
 Sum of digits = 2 + 3 = 5 (Prime)
*/

import java.util.Scanner;
public class SumOfDigitsIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();
        int copy = n;
        int sum = 0;
        int count = 0;
        while(copy>0){
            int last = copy % 10;
            sum = sum + last;
            copy = copy / 10;

            
        }
        for(int i = 1; i<=sum; i++){
            if(sum % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.print("Numeber is Prime");

        }
        else{
            System.out.println("Number is not Prime");
        }

    }
}

