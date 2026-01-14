/*
 Question:
 Write a Java program to find the power of a number
 without using Math.pow().
*/

class Main {
    public static void main(String[] args) {
        int n = 5; // base
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i*i;
        }
        System.out.print(sum);
    }
}

/*
 Alternative Solution:
 
 public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        System.out.println("Result: " + result);
    }
}
*/