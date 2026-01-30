
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do { 
            System.out.println("Calculator - Menu");
            System.out.println("1 for addition");
            System.out.println("2 for subtraction");
            System.out.println("3 for multiplication");
            System.out.println("4 for division");
            System.out.println("5 for Exit");
            
            System.out.println("Select choice : ");
            choice = sc.nextInt();

            if(choice >= 1 && choice < 5){
                System.out.println("Enter your first Number:");
                int a = sc.nextInt();
                System.out.println("Enter your second number: ");
                int b = sc.nextInt();

                switch(choice){
                    case 1 -> System.out.println("Addition: " +(a+b));
                    case 2 -> System.out.println("Substraction: "+(a-b));
                    case 3 -> System.out.println("Multiplication: "+ (a*b));
                    case 4 -> {
                        if(b != 0){
                             System.out.println("Division: "+(a / b));
                        }
                        else{
                            System.out.println("Zero is not allowed");
                        }
                    }
                }
                
            }

            
        } while (choice < 5);
        System.out.println("Calculator is Closed");

    }
}