

/*
 Question:
 Write a Java program to print the multiplication
 table of a number using a do-while loop.
*/

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 2;
        int i = 1;
        do{
            int pro = n*i;
            System.out.println(pro);
            i++;
        }while(i<=10);
        
    }
}