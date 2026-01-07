/*
 Question:
 Write a Java program to check whether a number
 is a Strong number.

 Note:
 A Strong number is a number whose sum of
 factorial of digits equals the number.
 Example: 145 → 1! + 4! + 5! = 145
*/


public class StrongNumber {
    public static void main(String[] args) {
        int n = 145;
        int result =  0;
        int digit;
        
        for(int i = n; i > 0; i = i / 10){
            digit = i % 10;   //modulus gives remainder
            int fact = 1;
           
            for(int j = 1; j <= digit; j++){
                fact = fact*j;
                //System.out.println(fact);
            }
            result = result + fact;
                //System.out.println(result);
        }
        if(result == n){
            System.out.print("Number is Strong Number");
        }
        else{
            System.out.print("Number is not Strong number");
        }
        
    }
}