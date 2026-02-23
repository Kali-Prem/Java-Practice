//This is not encapsulation

public class Main {
    public static void main(String[] args) {
        Animal s1 = new Animal();
        s1.name = "Dogesh";
        s1.age = 20;
        //s1.Barking();
        // a1.animalProperties("Barking");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.animalProperties("Barking"));
        //a1.animalproperties("Barking");
        Animal s2 = new Animal();
        s2.name = "Dog";
        s2.age = 14;
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.animalProperties("Barking"));

        
    }
}
class Animal {
    //variable
    String name;
    int age;
    //Methods
    //Properties
    // public void Barking(){
    //     System.out.println("Dog is barking");
    // }

    public String animalProperties(String Properties){
        return Properties;
    }
}