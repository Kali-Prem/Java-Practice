import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        // Declare variables for principal, rate, and time
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        double rate = sc.nextDouble();  
        System.out.print("Enter time (in years): ");
        double time = sc.nextDouble();

        // Calculate simple interest
        double interest = (principal * rate * time) / 100;

        // Print the simple interest
        System.out.println("The simple interest is: " + interest);
    }
}