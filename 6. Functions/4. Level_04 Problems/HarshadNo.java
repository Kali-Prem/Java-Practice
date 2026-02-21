//=======================Harshad Number Check Using Functions==============
import java.util.*;
public class HarshadNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(checkHarshadNo(n) == true){
            System.out.println("Number is harsed");
        }
        else{
            System.out.print("-1");
        }
    }
    public static boolean checkHarshadNo(int n){
        int copy =  n;
        int sum = 0;
        while(copy > 0){
            int digit = copy % 10;
            sum = sum + digit;
            copy = copy / 10;


        }
        return n % sum == 0;   // This will return true if n is divisible by sum, and false otherwise. It's a more concise way to write the same logic as the if-else statement.
        // if(n % sum == 0) return true;
        // else return false;
    }
}