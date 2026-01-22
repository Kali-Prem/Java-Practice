/*
 Question:
 Write a Java program to print even numbers from
 1 to 50 using a do-while loop.
*/

public class EvenNumbers {
    public static void main(String[] args) {
        int i = 1;
        do{
            if(i%2 == 0){
                System.out.println("even number " + i);
            }
            i++;
            
        } while(i<=50);
        
    }
}