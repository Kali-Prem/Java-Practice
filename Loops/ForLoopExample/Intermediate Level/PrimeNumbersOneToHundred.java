/*
 Question:
 Write a Java program to print all prime numbers
 between 1 and 100 using a for loop.
*/

public class PrimeNumbersOneToHundred {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i = i + 1) {
            int fact = 0;
            for(int j = 1; j <= i; j = j + 1){ // this loops run i times 
                if(i % j == 0){
                    fact = fact + 1;
                }
            }
            if(fact == 2){
                System.out.println(i);
            }
        }
    }
}
        




        
        /*
        System.out.println("Prime numbers between 1 and 100 are:");

        // Loop through numbers from 2 to 100
        for (int number = 2; number <= 100; number = number + 1) {
            boolean isPrime = true;

            // Check if the number is prime
            for (int i = 2; i <= Math.sqrt(number); i = i + 1) {
                if (number % i == 0) {
                    isPrime = false; // Found a factor, so it's not prime
                    break; // No need to check further
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}*/