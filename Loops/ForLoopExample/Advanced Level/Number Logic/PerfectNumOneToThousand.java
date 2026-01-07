/*
 Question:
 Write a Java program to print all Perfect numbers
 between 1 and 1000.
*/


public class PerfectNumOneToThousand {
    public static void main(String[] args) {
        for(int i = 1; i <= 1000; i++){                // explore each number from 1 to 1000
             int digit = 0;
            for(int j = 1; j < i; j++){           
                
                if(i % j == 0){                      // check whether j is a proper divisor of i
                    digit = digit +j;             // sum of proper divisors
                    //System.out.print(digit);
                }
                
            }
            if(i == digit){
                System.out.println("Perfect Number " + i );
            }
            // else{
            //     System.out.println("Not Perfect Number");
            // }
        }
    }
}






// Another Approach:
/*

public class PerfectNumbersOneToThousand {
    public static void main(String[] args) {

        for (int num = 1; num <= 1000; num++) {
            int sum = 0;

            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num && num != 0) {
                System.out.println(num);
            }
        }
    }
}
*/