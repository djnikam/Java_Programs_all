// Problem Statements1: Interface : Implement java program for following
// You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). You need to write a class called MyCalculator which implements the interface.
// divisorSum function just takes an integer as input and return the sum of all its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. 
// Sample Input
// 6
// Sample Output
// I implemented: AdvancedArithmetic
// 12
// Explanation
// Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.  
import java.util.Scanner;

interface  AdvancedArithmetic{
    public int divisorsum(int n);
}

class MyCalculator implements AdvancedArithmetic{
    public int divisorsum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum = sum+i;
            }
        }
        return sum;
    }
}

public class Divisors{
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
    
        System.out.println("Enter the Number :");
        int a = in.nextInt();
        MyCalculator m1=new MyCalculator();
        System.out.println("sum Divisors of number "+a+" is "+m1.divisorsum(a));   
    }
}