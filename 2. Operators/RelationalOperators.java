/*
 Question:
 Write a Java program to demonstrate relational operators
 such as >, <, >=, <=, ==, and !=.
*/

public class RelationalOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // Greater than
        System.out.println("Is " + x + " > " + y + "? : " + (x > y));

        // Less than
        System.out.println("Is " + x + " < " + y + "? : " + (x < y));

        // Greater than or equal to
        System.out.println("Is " + x + " >= " + y + "? : " + (x >= y));

        // Less than or equal to
        System.out.println("Is " + x + " <= " + y + "? : " + (x <= y));

        // Equal to
        System.out.println("Is " + x + " == " + y + "? : " + (x == y));

        // Not equal to
        System.out.println("Is " + x + " != " + y + "? : " + (x != y));
    }
}