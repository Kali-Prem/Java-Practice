/*
 Question:
 Write a Java program to print all Armstrong numbers
 between 1 and 1000 using for loops.

 Note:
 An Armstrong number is a number that is equal to the sum
 of its own digits each raised to the power of the number
 of digits.

 Example:
 153 = 1³ + 5³ + 3³ = 153
*/


public class ArmsOneToThousand {
    public static void main(String[] args) {
        for(int i = 1; i <= 1000; i++){
            
               int l = String.valueOf(i).length(); 
               //System.out.print(l);      
               int digit;
               int num = 0;
            
               for(int j = i; j > 0; j = j / 10){
                    digit = j % 10;
                    //System.out.print(digit);
                    double p = Math.pow(digit,l);
                    num = num + (int)p;
                }
                
                if(num == i){
                System.out.println("Armstrong no:- " + i);
                }          
            
            
            
        }
    }
}



// Output:
/*
Armstrong no:- 1
Armstrong no:- 2
Armstrong no:- 3
Armstrong no:- 4
Armstrong no:- 5
Armstrong no:- 6
Armstrong no:- 7
Armstrong no:- 8
Armstrong no:- 9
Armstrong no:- 153
Armstrong no:- 370
Armstrong no:- 371
Armstrong no:- 407 
*/



// Explanation:
/*
 The program uses a for loop to iterate through all numbers
 from 1 to 1000. For each number, it calculates the number
 of digits and then uses another for loop to extract each
 digit, raise it to the power of the number of digits, and
 sum these values. If the sum equals the original number,
 it prints that number as an Armstrong number.
*/




// Alternative Approach