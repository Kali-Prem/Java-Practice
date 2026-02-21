// Question: Write a program to check if a number is prime or not using a function.

import java.util.*;

class CheckPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPrime(num);
        System.out.print(isPrime(num));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {       // We only need to check up to n/2 because a larger factor of n must be a multiple of a smaller factor that has already been checked. and also 1 and n will always be factors of n, so we can skip those.
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Another way to solve this problem

    /*
    public static boolean iskPrime(int num){
        //boolean check = true;
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }
        return count == 2;  // This will return true if count is 2, and false otherwise.

        // if(count == 2) return true;
        // else return false;
        // what is difference between these two return statements?
        // In the first return statement, we directly return the result of the expression count == 2, which evaluates to true if count is equal to 2 and false otherwise. This is a more concise way to return the result of the condition.
        

    }
     */
}
