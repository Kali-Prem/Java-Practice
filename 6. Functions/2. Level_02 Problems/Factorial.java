// Question: Write a program to find the factorial of a number using a function.



import java.util.*;
class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printFactorial(num);
        System.out.println("Factorial is : "+printFactorial(num));

    }

    public static int printFactorial(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact*i;
        }
        return fact;
    }
}