import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int Balance = 500;
        int amount;
        int pin = 1234;
        int auth;

        do { 
            System.out.println("=======ATM Menu=======");
            System.out.println("1. Balance inquiry");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.println("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1 -> {
                    System.out.println("Enter Your Pin: ");
                    auth = sc.nextInt();
                    if(auth == pin){
                        System.out.println("Total Balance: "+ Balance);
                    }
                    else{
                        System.out.println("Please enter Correct pin");
                    }
                }
                    
                case 2 -> {
                    System.out.println("Enter Your Pin: ");
                    auth = sc.nextInt();
                    if(auth == pin){
                        System.out.println("Enter Amount:");
                        amount = sc.nextInt();
                        Balance = Balance + amount;
                    }
                    else{
                        System.out.println("Please Enter correct pin");
                    }
                }
                    
                case 3 -> {
                    System.out.println("Enter Your Pin: ");
                    auth = sc.nextInt();
                    if(auth == pin){
                        System.out.print("Enter Widhrawal amount: ");
                        amount = sc.nextInt();
                        Balance = Balance - amount;
                        System.out.println("Withdraw is Successfull");
                        System.out.println("Remaining Balance: "+ Balance);
                    }
                    else{
                        System.out.println("Please Enter correct pin");
                    }
                }
            }


        } while (choice < 4);
        System.out.println("Please Enter Valid Choice");
    }
}