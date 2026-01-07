/*
 Question:
 Write a Java program to print all prime numbers
 up to N using for loops.
*/


public class PrimeNumbersUpToN {
    public static void main(String[] args) {
         int n = 50;
         
         for(int i = 2; i <= 50; i = i + 1){      // first loop for each number
             int count = 0;
             for(int j = 1; j <= i; j = j+1){     // second loop to check divisibility
                
                 if(i % j == 0){                    // condition to check divisibility
                     count = count + 1;           // increment count if divisible
                 }
             }
             if(count == 2){
                 System.out.println(i);
             }
         }
    }
}




// Another way
/*
public class PrimeNumbersUpToN {
    public static void main(String[] args) {

        int n = 50;

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
*/