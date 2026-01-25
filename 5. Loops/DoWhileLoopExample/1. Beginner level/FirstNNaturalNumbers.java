/*
 Question:
 Write a Java program to print first N natural numbers
 using a do-while loop.
*/
import java.util.*;
public class FirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        do { 
            System.out.println(i);
            i++;
        } while (i<=N);
    }
}