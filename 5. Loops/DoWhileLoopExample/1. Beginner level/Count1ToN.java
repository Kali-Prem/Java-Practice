
import java.util.*;

public class Count1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        int count = 0;
        do{
            count++;
            i++;

        }while(i<=N);
        System.out.println(count);
    }
}