/*
 Question:
 Write a Java program to print numbers divisible by 5
 between 1 and 100 using a do-while loop.
*/

public class DivisibleByFive {
    public static void main(String[] args) {
        int i = 1;
        do { 
            if(i % 5 == 0){
                System.out.println(i);
            }
            i++;
        } while (i<=100);
    }
}