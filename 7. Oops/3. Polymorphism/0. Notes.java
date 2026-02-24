//===========================PolyMorphism=========================
/*
Polymorphism : - Naam ek aur kaam anek


Polymorphism generally Resolve Error

Error like: 1.) Overloading
            2.) Overriding


*/

//===============1.) Overloading =====================
/*
# Note:- No errors in overloading because of different parameters but can increase complexity of code

# Overlaoding:-> Function / Method Overloading

Function Name      -> Same
Function Parameter -> Different

#Code : ->
public static int add(int a, int b){
    return a +b ;
}
public static int add(int a, int b, int c){
    return a+b+c;
}

*/

//=================2.) Overriding =========================
/*
# Overriding:-> Function / Method Overriding
Function Name      -> Same
Function Parameter -> Same

# Note:- Compile time error in overriding because of same method name and same parameters but can be resolved by using @Override annotation
#Solution:-> Use @Override annotation to resolve error Or make Overloading

#Code : ->
public static int add(int a, int b){
    return a +b ;
}
public static int add(int a, int b){
    return a+b;
}

*/

