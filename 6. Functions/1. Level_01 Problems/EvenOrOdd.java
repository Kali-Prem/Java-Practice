// Question: Write a program to check whether a number is even or odd using a function.


import java.util.*;
class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        EvenOdd(num);
        System.out.print(EvenOdd(num));
    }

    public static String EvenOdd(int num){
        if(num % 2 == 0){
            return "Even";
        }
        else{
            return "Odd";
        }

    }
    // public static boolean isEven(int num) {
    // return num % 2 == 0;
    // }
}