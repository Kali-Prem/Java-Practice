/*
 Question:
 Write a Java program to check whether a number
 is a Duck number.
 Note : Duck number -- number having atleast one zero but not starting with zero

 Note :- kisi bhi integer value ke aange zero lgane se wo hexa code bn jata hai ;
*/


public class DuckNumber {
    public static void main(String[] args) {
        int n = 01023;
        int temp = n;
        boolean check = false;

        for(int i = temp; i > 0 ; i = i/10 ){
            if(i % 10 == 0){
                check = true;
                break;
            }
              
        }
        if(check == true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        


    }
}