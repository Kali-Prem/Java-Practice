/*
 Question:
 Write a Java program to check whether a number
 is a Perfect number.

 Note:
 A perfect number is a number whose sum of
 proper divisors is equal to the number itself.
 Example: 6 → 1 + 2 + 3 = 6
*/


public class PerfectNumber {
    public static void main(String[] args) {
        int n = 6;
        int sum =0;
        
        for(int i =1; i < n; i++){
            if(n % i == 0){
                sum = sum +i;
            }
        }
        if(sum == n){
            System.out.print("Perfect Number");
        }
        else{
            System.out.print("Not Perfect Number");
        }
    }
}




