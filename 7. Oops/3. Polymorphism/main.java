class main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        System.out.println(add(a, b));
        System.out.println(add(a, b, c));
    }
    //=======================Overloading=========================
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }

    //=========================Overriding=========================
    
    //# This will give compile time error because of same method name and same parameters but can be resolved by using @Override annotation or make overloading
    
    // public static int add(int a, int b){ 
    //     return a+b;
    // }    
    // public static int add(int a, int b){
    //     return a+b;  
    // }
}
