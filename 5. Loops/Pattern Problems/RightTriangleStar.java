/*
 Question:
 Write a Java program to print a right-angled triangle star pattern.

 Output:
 *
 * *
 * * *
 * * * *

*/

public class RightTriangleStar {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}




/*
public class RightTriangleStar {
    public static void main(String[] args) { 
        for(int i = 1; i<= 4; i++) {        // Outer loop for rows
            for(int j = 1; j <= i; j++) {  // Inner loop for columns
                System.out.print("* ");    // Print star followed by space
            }
            System.out.println();         // Move to the next line after each row
        }
    }
}
*/

// Another Approach

/*
public class RightTriangleStar {
    public static void main(String[] args) {
        int n = 4; // Height of the triangle
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}   
*/