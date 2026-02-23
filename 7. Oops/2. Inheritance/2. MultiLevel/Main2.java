
public class Main2 {

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.name = "Kali";
        c1.age = 20;
        c1.gender = "Male";
        c1.eyeColour = "Blue";

        grandChild c2 = new grandChild();
        c2.mobile = 78;

        System.out.println(c1.name);
        System.out.println(c1.gender);
        System.out.println(c1.age);
        System.out.println(c1.eyeColour);
        System.out.println(c1.gender);

        System.out.println(c2.mobile);

    }
}

class Parents {

    String name;
    int age;
    String gender;
}

class Child extends Parents {

    String eyeColour;
}

class grandChild extends Child {

    int mobile;
}
