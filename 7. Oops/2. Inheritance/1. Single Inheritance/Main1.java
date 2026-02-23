public class Main1 {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.name = "Hacker";
        c1.age = 20;
        c1.height = 5;

        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.height);
    }
}
//Parent class
class Parent {
    //Parent has Two Properties
    String name;
    int age;

}
// Child class
class Child extends Parent {    // here extends keywords give two properties from parent to child, so Now Child has Total 3 Properties
    int height;

}