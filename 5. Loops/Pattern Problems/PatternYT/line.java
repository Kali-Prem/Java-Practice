
import java.util.Scanner;

/*

*   
 *  
  * 
   *

*/

/*

import java.util.Scanner;

class line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<= n; i++){
            for(int j = 1; j <= i-1; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}

*/

//======================Mirror==================

/*

   *
  * 
 *  
*

*/

/*
import java.util.*;
class line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

    }
}

*/

class line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = n-i; j >= 1; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


