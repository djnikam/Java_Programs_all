// 6d)	Check whether entered number is Armstrong or not   
    
import java.util.*;
//import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
    
        int num, temp, d, sum=0;
        Scanner in = new Scanner(System.in);
    
        System.out.println("Enter the Number :");
        num = in.nextInt();

        temp = num;
        while(num>0)
        {
            d = num%10;
            sum +=(Math.pow(d, 3));
            num = num/10;
        }

        if(temp == sum)
        {
            System.out.println("The given number "+temp+" is Armstrong number.");
        }
        else
        {
            System.out.println("The given number "+temp+" is not an Armstrong number.");
        }      
    }
}
