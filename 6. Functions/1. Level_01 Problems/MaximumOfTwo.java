// Question: Write a program to find the maximum of two numbers using a function.


import java.util.*;
class MaximumOfTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        maxOf(a,b);
        System.out.print(maxOf(a,b));

    }
    public static int maxOf(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }

    }
}