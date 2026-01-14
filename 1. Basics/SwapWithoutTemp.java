public class SwapWithoutTemp {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        a = a + b; // a now becomes 30
        b = a - b; // b becomes 10
        a = a - b; // a becomes 20
        //System.out.println(a + " " + b);
        System.out.println("a = " + a);
        System.out.print("b = " + b);
    }
}