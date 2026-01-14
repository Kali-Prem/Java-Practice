/*
 Question:
 Write a Java program to find the digital root
 of a number using for loops.

 Example:
 987 → 9+8+7 = 24 → 2+4 = 6
*/

public class DigitalRoot {
    public static void main(String[] args) {
        int n = 987;
        int digit1;
        
        while(n>0){
            int sum = 0;
            for(int i = n; i > 0; i = i/10){
                digit1 = i % 10;
                sum = sum + digit1;  // 9+8+7=24    
            }
            if(sum / 10 == 0){          // single digit check (by division- until the quotient is 0--quotient is zero when single digit)
                System.out.print(sum);
                break;                    // exit from while loop
            }
            else{
                n = sum;                  // assigning sum to n for next iteration
            }    
        }
   
    }
}




// Another way
/*  
public class DigitalRoot {
    public static void main(String[] args) {

        int number = 987;

        while (number > 9) {
            int sum = 0;

            for (int n = number; n != 0; n /= 10) {
                sum += n % 10;
            }

            number = sum;
        }

        System.out.println("Digital Root = " + number);
    }
}
*/