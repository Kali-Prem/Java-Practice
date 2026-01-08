/*
 Question:
 Write a Java program to find the Nth prime number
 using for loops.

 n = 50
 k = 3
*/


public class NthPrimeNumber {
    public static void main(String[] args) {
        int k = 3;
         int nth = 0;
        
        for(int i = 2; i <= 50; i ++){
            
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i% j == 0){
                    count = count + 1;
                }
            }
            if(count == 2){

                nth = nth + 1;

            }
             if(nth == k){
                    System.out.print(i);
                    break;
             }
            
        }
    }
}