
/*
 Question:
 Write a Java program to check whether a given number
 is an Armstrong number using a for loop.

 Note:
 An Armstrong number is a number that is equal to the sum
 of its own digits each raised to the power of the number
 of digits.

 Example:
 153 = 1³ + 5³ + 3³ = 153
*/

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int dummy = n;
      int copy = n;
      int digit = 0;
      int sum = 0;
      
      while(n > 0){
        digit = digit + 1;
        n = n / 10;
      }
      while(dummy > 0){
        int rem = dummy % 10;
        sum = sum + (int)Math.pow(rem, digit);
        dummy = dummy / 10;
        
      }
      if(copy == sum){
        System.out.print("Armstrong no");
      }
      else{
        System.out.print("Not");
      }
  }
}




public class ArmstrongNumber {
    public static void main(String[] args) {
    
        int n = 153;

        if(n >= 0 && n <= 9){                      // Single digit numbers are Armstrong numbers
            System.out.print("Armstrong Number");
        }
        
        else if(n >= 11){                         // Checking for numbers greater than 10
            int l = String.valueOf(n).length();   // Finding length of number
            //System.out.print("Length: " + l);
            int digit;
            double num = 0;
            
            for(int i = n; i >0; i = i / 10){       // Loop to extract each digit
                digit = i % 10;                     // Extracting last digit
                double result = Math.pow(digit,l);
                //System.out.println(result);        // for testing purpose
                num = num + (int)result;             // Adding the power of each digit
                //System.out.println(num);           // for testing purpose
            }

            if(num == n){                            // Comparing the sum of powers with the original number
                System.out.print("Armstrong Number");
            }
            else{                                      // If not equal
                System.out.print("Not Armstrong Number");
            }
            
        }
        else{                                         // For number 10
            System.out.print("Not Armstrong Number");
        }
    }
}



// Another Approach:



/*
import java.util.Scanner;   

public class ArmstrongNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        
        for (int i = n; i > 0; i /= 10) {
            int digit = i % 10;
            sum += Math.pow(digit, digits);
        }
        if (sum == originalNumber) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
*/




// Another Approach with Function:



/*
public class ArmstrongNumber {
    public static void main(String[] args) {

        int number = 153;
        int original = number;
        int digits = 0;
        int sum = 0;

        // Count number of digits
        for (int n = number; n != 0; n /= 10) {
            digits++;
        }

        // Calculate Armstrong sum
        for (int n = number; n != 0; n /= 10) {
            int digit = n % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power *= digit;
            }

            sum += power;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}
*/