/*
===========================
1. What is Inheritance?

Inheritance is a mechanism in Java where one 
class acquires the properties (variables) and behaviors (methods) of another class.

==========================
2. Why Use Inheritance?

✔ Code Reusability
✔ Method Overriding
✔ Polymorphism
✔ Cleaner and Structured Code

==========================
3 Types of Inheritance in JAVA:
 
 1.Single Inheritance
 2.Multi level Inheritance
 3.Hierarchical Inheritance

 ==========================
 #Syntax of Inheritance
 class Parent {
    // properties and methods
}

class Child extends Parent {    // Child class inherits from Parent class and extends keyword is used to inherit the properties and methods of parent class
    // additional properties and methods
    // additional features
}

Note: 👉 extends keyword is used.


*/

/*

=================1. Single Inheritance=================
Note: In single inheritance, ek parent ke ek child hota hai, means ek class dusre class se inherit karti hai.

class Parent {
    // Parent class properties
    String name;
    String hairColor;
}
class Child extends Parent {      // Child class inherits from Parent class , means child class has all properties of parent as well as its own properties
    // Child class properties
    String eyeColor;
    
}


=================2. Multi level Inheritance=================
Note: In multi level inheritance, ek parent ke ek child hota hai, aur us child ka bhi ek child hota hai, means ek class dusre class se inherit karti hai, aur wo class bhi kisi aur class se inherit karti hai.
class grandParent {
    // grandParent class properties
    String name;
    String hairColor;
}
class Parent extends grandParent {      // Parent class inherits from grandParent class
    // Parent class properties
    String name;
    String hairColor;
}
class Child1 extends Parent {      // Child1 class inherits from Parent class
    // Child1 class properties
    String eyeColor;
}
class Child2 extends Child1 {     // Child2 class inherits from Child1 class, means child2 class has all properties of child1 as well as parent class
    // Child2 class properties
    int height;
}

=================3. Hierarchical Inheritance=================
Note: In hierarchical inheritance, ek parent ke multiple child hota hai, means ek class dusre class se inherit karti hai, aur wo class bhi kisi aur class se inherit karti hai.
class Parent {
    // Parent class properties
    String name;
    String hairColor;
}
class Child1 extends Parent {      // Child1 class inherits from Parent class
    // Child1 class properties
    String eyeColor;
}
class Child2 extends Parent {      // Child2 class inherits from Parent class, means child2 class has all properties of parent class
    // Child2 class properties
    int height;
}

*/