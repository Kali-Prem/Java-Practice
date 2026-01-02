/*
 Question:
 Write a Java program to demonstrate logical operators
 such as AND (&&), OR (||), and NOT (!).
*/

public class LogicalOperators {
    public static void main(String[] args) {
        boolean p = true;
        boolean q = false;

        // AND operator
        System.out.println("Logical AND (p && q): " + (p && q));

        // OR operator
        System.out.println("Logical OR (p || q): " + (p || q));

        // NOT operator
        System.out.println("Logical NOT (!p): " + (!p));
        System.out.println("Logical NOT (!q): " + (!q));
    }
}