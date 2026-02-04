/*
 Question:
 Write a Java program to print a square star pattern.

 Output:
 * * * *
 * * * *
 * * * *
 * * * *
*/

public class SquareStarPattern {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 4; i++) { // Outer loop for rows
           
            for(int j = 1; j <= 4; j++) { // Inner loop for columns
                System.out.print("* "); // Print star followed by space
            }
            System.out.println(); // Move to the next line after each row
        }
        
    }
}

// Another Approach

/*
public class SquareStarPattern {
    public static void main(String[] args) {
        int n = 4; // Size of the square
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
         }
        
    }
}   
*/