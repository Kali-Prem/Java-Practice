/*

Question 3:

Create an ATM class.

Private variable: balance

Methods: deposit(), withdraw()

Withdrawal should not exceed balance  //this means we have to validate the withdrawal amount enter by the user

 */

public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.deposit(10000);
        atm.withdraw(7000);

        System.out.println("Your Balance is " + atm.getBalance());

    }
}

class ATM {

    private double balance;

    //Here Two Setter is used
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount is Successfully deposited");
            System.out.println("Your Available Balance is " + balance);
        } else {
            System.out.println("Please Enter Valid Amount");
        }

    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal is Successfull");
            System.out.println("Your Remaining Balance is " + balance);
            System.out.println("Thanks For Visiting");
        } else {
            System.out.println("Insufficient Balance");

        }

    }

    //Getter Function
    public double getBalance() {
        return balance;
    }
}
