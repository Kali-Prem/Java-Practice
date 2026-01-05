/*
 Question:
 Write a Java program to print a number triangle pattern.

 Output:
 1
 1 2
 1 2 3
 1 2 3 4
*/


public class NumberTriangle {
    public static void main(String[] args) 
    {
        
        for(int i = 1; i <= 4; i++) 
        {
            int num = 0;
            for(int j = 1; j <= i; j++) 
            {
                num = num+1;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}


// Another Approach 


/*
public class NumberTriangle {
    public static void main(String[] args)
    {
        int n = 4;             // Number of rows
        for(int i = 1; i <= n; i++) 
        {
        
            for(int j = 1; j <= i; j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}   
*/