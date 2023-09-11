// 6E)Check whether entered number is Strong or not  
    
import java.util.*;
public class Strongno{
    public static void main(String[] args) {
    
        int num, sum =0, temp, d, fact = 1;
        Scanner in = new Scanner(System.in);
    
        System.out.println("Enter the Number :");
        num = in.nextInt();
        temp = num;

        while(temp>0)
        {
            d = temp%10;
            for(int i =1; i<=d;i++)
            {
                fact = fact*i;
            }
            sum = sum +fact;
            temp = temp/10;
            fact = 1;
        }
        if(num == sum)
        {
            System.out.println("The given number "+num+" is Strong number.");
        }
        else
        {
            System.out.println("The given number "+num+" is not a Strong number.");
        }          
    }
}
