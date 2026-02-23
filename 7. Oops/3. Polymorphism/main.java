class main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        System.out.println(add(a, b));
        System.out.println(add(a, b, c));
    }
    //=======Overloading=================
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
}
