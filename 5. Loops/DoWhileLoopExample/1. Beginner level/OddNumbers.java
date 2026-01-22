/*
 Question:
 Write a Java program to print odd numbers from
 1 to 50 using a do-while loop.
*/

public class OddNumbers{
    public static void main(String[] args){
        int i = 1;
        do{
            if(i % 2 != 0){
                 System.out.println(i);
            }
            i++;
           
        }while(i<=50);
    }
}