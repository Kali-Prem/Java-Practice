
public class ArmstrongNumber {
    public static void main(String[] args) 
    {
    
         int n = 45;
        if(n >= 0 && n <= 9)
        {
            System.out.print("Armstrong Number");
        }
        else if(n >= 11)
        {
            int l = String.valueOf(n).length();
            int digit;
            double num = 0;
            
            for(int i = n; i >0; i = i / 10)
            {
                digit = i % 10;
                double result = Math.pow(digit,l);
                num = num*10 + result;
            }
            
        }
        else
        {
            System.out.print("Not Armstrong Number");
        }
    }
}