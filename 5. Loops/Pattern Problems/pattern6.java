public class pattern6 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = n; j>=i; j--){
                System.out.print("*");
            }
            for(int j = 2*(n-i); j>= 1; j--){
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}