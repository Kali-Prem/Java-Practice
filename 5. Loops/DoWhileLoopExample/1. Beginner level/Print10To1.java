/*
 Question:
 Write a Java program to print numbers from 10 to 1
 using a do-while loop.
*/


public class Print10To1 {
    public static void main(String[] args) {
        int i = 10;
        do { 
            System.out.println(i);
            i--;
        } while(i>0);
    }
}