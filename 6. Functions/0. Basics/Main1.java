//=============Basics Of Functions==========================================
class Main1 {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibbonaci(n));
        System.out.println(tribbonaci(n));
        System.out.print(prime(n));

    }

    public static int fibbonaci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static int tribbonaci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        int sum = 0;
        if (n == 0 || n == 1) {
            return n;
        }
        for (int i = 3; i <= n; i++) {
            sum = a + b + c;
            a = b;
            b = c;
            c = sum;
        }
        return sum;

    }

    public static boolean prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            
        }
        return count == 2;
        
    }
}
