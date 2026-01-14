/*
 Question:
 Write a Java program to find the sum of
 Fibonacci series up to N terms.
*/



public class SumOfFibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = a + b;               // Initialize sum with first two terms
        int next_num;
        
        for(int i =1; i<=8; i++){       // Loop to calculate next 8 terms
            next_num = a + b;           // Calculate next term
            sum = sum + next_num;         // Add next term to sum
            a = b;                       // Update a to b
            b = next_num;               // Update b to next_num
        }
        System.out.print(sum);
    }
}



// best way
/*
public class SumOfFibonacci {
    public static void main(String[] args) {

        int n = 10;
        int first = 0, second = 1;
        int sum = first + second;

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            sum += next;
            first = second;
            second = next;
        }

        System.out.println("Sum of Fibonacci series = " + sum);
    }
}
*/