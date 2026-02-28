/*
Questions: Student Management System

Description:

👉 Create a Student class:

    Private variables: name, rollNo, marks   
    Use getter and setter methods (Encapsulation)
    Create a method displayDetails()

👉 Create a SchoolStudent class that:

    Inherits from Student
    Adds a new variable grade
    Overrides displayDetails() method

👉 In main function:

    Create object of SchoolStudent
    Show runtime polymorphism

 */

//===========Main function================
/*
public class StudentSystem {

    public static void main(String[] args) {
        SchoolStudent s = new SchoolStudent();
        s.setName("Kali Linux");
        s.setRollNo(01);
        s.setMarks(100);
        
    }
}

//=========Student class============
class Student {

    private String name;
    private int rollNo;
    private int marks;

    //setter function
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    //Getter Function
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }

    //getDetails functoin
    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);

    }

}

//=============SchoolStudent=============
class SchoolStudent extends Student {

    private String grade;

    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getGrade(){
        return grade;
    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println();

    }
}


//## Doubt:
//Inherits krne pr uske bhi sare properties ko esme display kese krwaye
//student class ke sare getdetails wale ko ess class me bina utna system.out likhe kese print kre


/*

//==========Chatgpt solution=====================: 

class Student {
    private String name;
    private int rollNo;
    private double marks;

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

class SchoolStudent extends Student {
    private String grade;

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override                                      // what is @override
    public void displayDetails() {
        super.displayDetails();                      // what is super
        System.out.println("Grade: " + grade);
    }
}

public class StudentSystem {
    public static void main(String[] args) {
        Student s = new SchoolStudent();  // Runtime Polymorphism      // Student and ScholStudent how

        s.setName("Rahul");
        s.setRollNo(101);
        s.setMarks(85.5);

        SchoolStudent ss = (SchoolStudent) s;        // What is this
        ss.setGrade("A");

        s.displayDetails();
    }
}

*/
