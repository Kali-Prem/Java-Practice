public class Basics {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Prem";
        t1.age = 30;
        t1.gender = "Male";
        t1.EmpID = "A123BK";

        System.out.println(t1.name);
        System.out.println(t1.age);
        System.out.println(t1.gender);
        System.out.println(t1.EmpID);
        
        //Student
        Student s1 = new Student();
        s1.name = "Kali linux";
        s1.age = 20;
        s1.gender = "Male";
        s1.mobile = 9;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);
        System.out.println(s1.mobile);
    }
}

class Teacher{
    String name;
    int age;
    String gender;
    String EmpID;

}
class Student {
    String name;
    int age;
    int mobile;
    String gender;
}

