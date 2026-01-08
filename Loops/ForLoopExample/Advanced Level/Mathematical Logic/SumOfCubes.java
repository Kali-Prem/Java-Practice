/*
 Question:
 Write a Java program to find the sum of cubes
 from 1 to N using a for loop.
*/

public class SumOfCubes {
    public static void main(String[] args) {
        int base = 5;
        int exponent = 3;
        int sum  = 1;
        
        for(int i = 1; i <= exponent; i++){
            sum = sum*base;
        }
        System.out.print(sum);
    }
}



// Another way
/*
public class SumOfCubes {
    public static void main(String[] args) {

        int n = 4;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i * i;
        }

        System.out.println("Sum of cubes = " + sum);
    }
}
*/