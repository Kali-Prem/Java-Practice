/*
 Question:
 Write a Java program to check whether a number
 is an Armstrong number using a while loop.
 */

public class ArmstrongNumber {

    public static void main(String[] args) {
        int n = 1543;
        int copy = n;            // copy for second while loop beacause n will become 0
        int dummy = n;           // copy for final comparison because n will become 0
        int count = 0;
        int sum = 0;

        while (n > 0) {          // first loop is to count number of digits
            count++;
            n = n / 10;
        }
        while (copy > 0) {        // second loop is to calculate sum of power of digits
            int digit = copy % 10;
            sum = sum + (int) Math.pow(digit, count);
            copy = copy / 10;
        }
        if (dummy == sum) {
            System.out.print("Armstrong no");
        } else {
            System.out.print("Not Armstrong no");
        }
    }
}



// This is a simpler version for 3-digit Armstrong numbers


/*
public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = 153; // You can change this number to test other cases
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit; // Assuming a 3-digit number
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
*/