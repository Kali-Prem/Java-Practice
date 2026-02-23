public class Main1 {
    public static void main(String[] args){
        Parent p1 = new Parent();
        p1.name = "Rajesh";
        p1.age = 50;
        p1.gender = "Male";
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.gender);

        Child1 c1 = new Child1();
        c1.name = "Akash";
        c1.age = 20;
        c1.gender = "Male";
        c1.eyeColor = "Blue";
        System.out.println(c1.name);
        System.out.println(c1.eyeColor);

        Child2 c2 = new Child2();
        c2.name = "Vikash";
        c2.hairColor = "Black";
        System.out.println(c2.name);
        System.out.println(c2.hairColor);

        Child3 c3 = new Child3();
        c3.name = "Ssunil";
        c3.height = 5;
        System.out.println(c3.name);
        System.out.println(c3.height);

    }
}
class Parent {
    String name;
    int age;
    String gender;

}
class Child1 extends Parent {
    String eyeColor;
}
class Child2 extends Parent {
    String hairColor;
}
class Child3 extends Parent {
    int height;
}