/*
 Question:
 Write a Java program to print the Lucas series using a for loop.

 Example:
 Lucas series starts with 2, 1
 Next terms are sum of previous two numbers.

 Output (first 10 terms):
 2 1 3 4 7 11 18 29 47 76
*/

import java.util.*;
public class LucasSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 2, b = 1;
        int sum = 0;

        if(n == 1 || n == 2){
            System.out.print(n);
        }
        else{ 
            for(int i = 3; i<=n; i++){
                sum = a + b;
                
                a = b;
                b = sum;

            }
            System.out.print(sum);
        } 
        
        

    }
}