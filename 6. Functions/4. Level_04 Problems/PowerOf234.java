import java.util.*;
public class PowerOf234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(powerOf2(n) == true){
            System.out.println("Power of 2");
        }
        if(powerOf3(n) == true){
            System.out.println("Power of 3");
        }
        if(powerOf4(n) == true){
            System.out.println("Power of 4");
        }

        
        
    }
    public static boolean powerOf2(int n){
        if(n == 1) return true;
        while(n > 1){
            if(n % 2 == 0){
                n = n/2;
            }
            else{
                return false;
            }
        }
        return true;
        

    }
    public static boolean powerOf3(int n){
        while(n > 1){
            if(n % 3 == 0){
                n = n/3;
            }
            else{
                return false;
            }
        }
        return true;
        

    }
    public static boolean powerOf4(int n){
        while(n > 1){
            if(n % 4 == 0){
                n = n/4;
            }
            else{
                return false;
            }
        }
        return true;

    }

}