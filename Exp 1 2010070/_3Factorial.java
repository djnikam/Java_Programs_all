import java.util.*;

public class _3Factorial{

    public static void main(String[] args) {
        int i;
        int a, fact=1;
        a=Integer.parseInt(args[0]);
        System.out.println(args[1]);
        for(i=1;i<=a;i++ )
        {
            fact =fact*i;
        }
        System.out.println("Factorial of number is :"+fact);
    }
}

