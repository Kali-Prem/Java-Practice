
import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {
        Welcome();
        Kali();
        ReturnSum();
        System.out.print(ReturnSum());
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ReturnMulti(a, b);
        ReturnSub(a, b);  //yahan pr pehle returnsub call hoga aur uss time pr input diya jayega esko a and b
        System.out.println(ReturnSub(a, b));
    }
    public static void Welcome(){             //No return and No parameter case
        System.out.println("It's Kali Bro");
    }
    public static void Kali(){
        System.out.println("My Name is Kali Linux");
    }
    public static int ReturnSum(){                    //Return but no parameter case
        return 2+5;
    }
    public static void ReturnMulti(int a, int b){      // Parameter but No Return Case
        System.out.println();
        System.out.println("Multiplication: "+a*b);
    }
    public static int ReturnSub(int a, int b){        // Parameter and Return Case
        int sub = a - b;
        return sub;        //or return a-b;
    }
}