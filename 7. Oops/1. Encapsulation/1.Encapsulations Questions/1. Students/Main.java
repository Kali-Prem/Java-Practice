/*
❓ Question 1:

Create a Student class using encapsulation.

Private variables: name, marks

Marks should be between 0–100

Use getter and setter methods

 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Student s1 = new Student();
        s1.setName(name);
        int M = 20;
        s1.setMarks(M);

        System.out.println(s1.getName());
        System.out.println(s1.getMarks());

    }
}
//Studnet class

class Student {

    private String name;
    private int marks;

    //public setter function for name
    public void setName(String name) {
        this.name = name;                //this.name means update the name variable with the given input and input may be anything but should be string.

    }

    //public getter function for name
    public String getName() {           // here no input is given because we just want to return the value of name variable which is private and we can access it through this public getter function.
        return name;
    }

    //setter for marks
    public void setMarks(int M) {
        if (M >= 0 && M <= 100) {       // Marks Validation
            this.marks = M;
        } else {
            System.out.println("Invalid Marks");
        }

    }

    public int getMarks() {
        return marks;
    }

}
