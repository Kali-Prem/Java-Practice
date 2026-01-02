public class SimpleInterest {
    public static void main(String[] args) {
        // Declare variables for principal, rate, and time
        double principal = 1000.0; // Principal amount in dollars
        double rate = 5.0;         // Annual interest rate in percentage
        double time = 3.0;         // Time in years

        // Calculate simple interest
        double interest = (principal * rate * time) / 100;

        // Print the simple interest
        System.out.println("The simple interest is: " + interest);
    }
}