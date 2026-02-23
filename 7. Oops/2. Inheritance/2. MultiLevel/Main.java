public class Main {
    public static void main(String[] args){
        //grandParent has two properties
        grandParent gp = new grandParent();
        gp.name = "Kali";
        gp.age = 70;

        System.out.println(gp.name);
        System.out.println(gp.age);
        
        //Parent has 3 properties
        Parent p = new Parent();
        p.name = "Linux";
        p.age = 40;
        p.height = 6;

        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.height);
        
        //Child has 4 Properties
        Child c = new Child();
        c.name = "New Kali";
        c.age = 20;
        c.height = 6;
        c.hairColor = "Black";

        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.height);
        System.out.println(c.hairColor);

    }
}

//Multilevel Inheritance: grandParent-->Parent->Child

class grandParent {           // grandParent has 2 properties here
    String name;
    int age;
}
class Parent extends grandParent{    // Parent has total 3 properties( 2 properties of grandparent and 1 self)
    int height;
}
class Child extends Parent{          //Child has total 4 properties(3 from parent and one of itself)
    String hairColor;

    
}