// Note: One parent → Multiple children
public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.name = "Kali";
        System.out.println(p.name);
        
        Child1 c1 = new Child1();
        c1.name = "Linux";
        c1.hairColor = "Black";
        System.out.println(c1.name);
        System.out.println(c1.hairColor);


        Child2 c2 = new Child2();
        c2.name = "New Kali";
        c2.height = 6;
        System.out.println(c2.name);
        System.out.println(c2.height);

        Child3 c3 = new Child3();
        c3.name = "Golu";
        c3.age = 20;
        System.out.println(c3.name);
        System.out.println(c3.age);
    }
}

// One Parent class
class Parent {
    String name;
}

// Multiple Child 
//child 1
class Child1 extends Parent {
    String hairColor;
}
//child 2
class Child2 extends Parent {
    int height;
}
//child 3
class Child3 extends Parent {
    int age;
}