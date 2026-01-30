/*
 Question:
 Write a Java program to check whether a number
 is a Disarium number.
 Example: 135 → 1¹ + 3² + 5³ = 135
 */

public class DisariumNumber {

    public static void main(String[] args) {
        int n = 135;
        int copy = n;
        int temp = n;
        int count = 0;
        int sum = 0;
        
        //Here we calculate the number of digits
        while (copy > 0) {      //here copy will destroyed
            count = count + 1;
            copy = copy / 10;

        }

        for (int i = temp; i > 0; i = i / 10) { // here temp will be destroyed
            int digit = i % 10;
            int pow = (int) Math.pow(digit, count);
            sum = sum + pow;
            count--;

        }

        if (sum == n) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not Disarium Number");
        }

    }
}
