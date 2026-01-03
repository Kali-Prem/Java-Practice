/*
 Question:
 Write a Java program to check whether a number
 is prime using a for loop.
*/

public class PrimeCheck {
    public static void main(String[] args) {
         int number = 29; // You can change this number to check for other numbers
         int fact = 0;
            for(int i=1;i<=number;i=i+1){
                if(number%i==0){
                    fact=fact+1;
                }
            }
            if(fact==2){
                    System.out.print(number+" is a prime number");
            }
            else{
                 System.out.print(number+" is not a prime number");
            }
    
            
      //Another way to do the same problem
      
      
      
      
      
      /*
        int number = 29; // You can change this number to check for other numbers
        boolean isPrime = true;

        // A prime number is greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Using a for loop to check for factors
            for (int i = 2; i <= Math.sqrt(number); i = i + 1) {
                if (number % i == 0) {
                    isPrime = false; // Found a factor, so it's not prime
                    break; // No need to check further
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        } */
    }
}