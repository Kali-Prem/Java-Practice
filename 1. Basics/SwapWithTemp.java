public class SwapWithTemp {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int temp;
        temp = a;
        a = b;
        b = temp;
        //System.out.println(a + " " + b);
        System.out.println("a = " + a);
        System.out.print("b = " + b);
    }
}
