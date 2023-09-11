import java.util.Scanner;

// You are given a class “Solution” and an inner class “CheckPrime”. The main method of class Solution takes an integer as input. The prime method in CheckPrime class checks whether a number is prime or not. You have to call the method prime of the class CheckPrime from the main method of the class Solution.

import java.util.Scanner;
public class Solution {
    
    static class CheckPrime{

        void  prime(int num)
        {
            int flag=0;
            for(int i=2;i<=num/2;++i)
            {
                if(num%i==0)
                {
                    flag=1;
                    break;
                }
            }

            if(flag==0)
            {
                System.out.println(num+" is Prime Number.");
            }
            else
            {
                System.out.println(num+" is Not prime Number.");
            }
        }
    }
public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    System.out.println("Enter The Number :");
    int a = in.nextInt();

    CheckPrime c1 = new CheckPrime();
    c1.prime(a);
        
    }
}
