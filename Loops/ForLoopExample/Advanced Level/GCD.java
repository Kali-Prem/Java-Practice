/*
 Question:
 Write a Java program to find the GCD (HCF)
 of two numbers using a for loop.
*/


public class GCD {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        
        for(int i = min; i >1 ; i--){           // Loop from min to 1
            if(max % i == 0 && min % i == 0){    // Checking whether i is a divisor of both numbers
                System.out.print("GCD: " + i);
                break;                           // Exit the loop once the GCD is found
            }
            
        }
    }
}




// Another Approach:
/*  
public class GCD {
    public static void main(String[] args) {

        int a = 36;
        int b = 60;
        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);
    }
}
*/