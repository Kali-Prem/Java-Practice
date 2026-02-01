
import java.util.Scanner;
public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;

        if(n == 1 || n == 1){
            System.out.println(n);
        }

        for(int i = 3; i<=n; i++){
            sum = a + b;
            a = b;
            b = sum;
        
        }
        System.out.println(sum);
        

    }
}