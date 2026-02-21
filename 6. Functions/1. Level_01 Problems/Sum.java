
// Question: Write a program to find the sum of two numbers using a function.


import java.util.*;
class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        returnSum(a,b);
        System.out.println(returnSum(a,b));


    }

    public static int returnSum(int a, int b){
        return a + b;
    }
}