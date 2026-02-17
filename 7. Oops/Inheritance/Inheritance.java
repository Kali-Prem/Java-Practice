class Inheritance {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.name = "Kali";
        c1.age = 20;
        c1.gender ="Male";
        c1.eyeColour = "Blue";

        System.out.println(c1.name);
        
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