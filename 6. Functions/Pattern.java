
import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        printSquarePattern(n);
        printTrianglePattern(n);
        printInverTriangle(n);
        printBinary(n);
        printHollow(n);
        printFlipTrianglePattern(n);
        printNumberTriangle(n);
        printAlternetNumber(n);
        printAlphabet(n);
        printXyz(n);

    }

    public static void printSquarePattern(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void printTrianglePattern(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void printInverTriangle(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void printBinary(int n) {
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= i; j++){
                if(i % 2 == 0){
                    if(j % 2 == 0){
                        System.out.print(0);
                    }
                    else{
                        System.out.print(1);
                    }
                }
                else{
                    if(j % 2 == 0){
                        System.out.print(1);
                    }
                    else{
                        System.out.print(0);
                    }
                }
            }
            System.out.println();
        }
        
    }
    public static void printHollow(int n) {
        for(int i = 1; i <=n ; i ++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n){
                    System.out.print("*");
                }
                else{
                    if(j == 1 || j == n){
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void printFlipTrianglePattern(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void printNumberTriangle(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        
    }
    public static void printAlternetNumber(int n) {
        int k = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(k);
                k++;

            }
            System.out.println();
        }
        
    }
    public static void printAlphabet(int n) {
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            for(int j = n-1; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void printXyz(int n) {
        for(){}
    }
    

}