
import java.util.Scanner;

class Main {

    public static void main(String[] args) {   //Main function hi manager hota hai jo koi input aur output sabhi function se leta hai , function uss input se diya gya work krke fir wo main ko return kr deta hai 
        Scanner sc = new Scanner(System.in);        // Yahan main function pehle user se input lega fir ye pehle uss function ko call krega jissey usko wo kaam krwana hoga , fir call krne pr wo aayega fir usko wo input dega aur bolega ye input lo aur kaam krke mujhe return kro fir main user ko dunga
        int a = sc.nextInt();
        int b = sc.nextInt();
        String name = sc.next();

        // kisi bhi function ko call krne ke liye uska naam likhna hota hai fir brackets lagana hota hai aur uske andar usko jitna input dena hai wo dena hota hai , agar function me parameter nahi hai to brackets ke andar kuch nahi dena hota haifir semicolon lagana hota hai
        //Call kro sum ko aur input do kaam krne ke liye
        Sum(a, b);                                // yahan pr main function ne sum function ko call kiya aur usko a and b diye fir sum function ne a and b ko add karke return kr diya fir main function ne usko print kr diya
        System.out.println(Sum(a, b));           // yahan pr sum function me a and b kyun dena jaruri hai kyunki sum function me parameter hai aur usko kaam krne ke liye a and b ki jarurat hai , agar a and b nahi diye to sum function ko pata nahi chalega ki usko kis number ko add krna hai isliye a and b dena jaruri hai

        //call kro subtracton ko aur fir bolo input a and b lekr subtract krke return krdo
        ReturnSub(a, b);
        System.out.println(ReturnSub(a, b));

        //call kro multiplication ko aur fir bolo input a and b lekr multiply krke return krdo
        ReturnMulti(a, b);
        System.out.println(ReturnMulti(a, b));

        // return name
        ReturnName(name);
        System.out.println(ReturnName(name));

    }

    //Function-   Access_modifier return_type fun_Name(parameter)
    // Structure of function :- Access modifier is optional but return type and function name is mandatory and parameter is also optional
    public static int Sum(int a, int b) {
        return a + b;

    }

    //Another function for Subtraction
    public static int ReturnSub(int a, int b) {
        return a - b;
    }

    //Another function for Multiplication
    public static int ReturnMulti(int a, int b) {
        return a * b;
    }

    //Another function for Division
    public static String ReturnName(String name) {
        return name;
    }

}
