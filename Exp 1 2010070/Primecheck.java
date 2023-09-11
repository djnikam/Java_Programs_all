// 6B)Check whether entered number is prime or not
import java.sql.SQLOutput;
import java.util.*;

public class Primecheck {

    public static void main(String[] args) {
        int a, count=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number :");
        a = input.nextInt();

        for(int i=1; i<=a;i++)
        {
            if(a%i==0)
            {
                count++;
            }
        }

        if(count ==2)
        {
            System.out.println(a+" the number is Prime");
        }
        else
        {
            System.out.println(a+" the number is Not Prime");  
        }
    }
    
}
