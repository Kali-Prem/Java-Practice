// Question: Write a program to find the square of a number using a function.

class Square {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        int num = 10;
        square(num);
        System.out.print(square(num));

    }

    public static int square(int num){
        return num * num;
    }
}