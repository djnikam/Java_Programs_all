package Exp_7_2010070;

import java.util.*;
public class Exp_7_4 {
    Scanner input = new Scanner(System.in);
//    void divide(int a,int b) throws Exception
//    {
//        if(b==0)
//            throw new Exception("Divide by zero");
//        else
//            System.out.println(a/b);
//    }
    void validate(int Age)
    {
        if(Age<18)
        {
            throw new ArithmeticException("Age is not Valid");
        }
        else
        {
            System.out.println("Valid Age");
        }
    }
    void arr()
    {
        int Arr[]= new int[3];
        for(int i = 0;i<3;i++)
        {
            Arr[i]=input.nextInt();
        }
        try
        {
            System.out.println(Arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("This is finally Block");
        }
    }
    public static void main(String[] args) throws Exception {
        Exp_7_4 a1 = new Exp_7_4();
//        a1.divide(10,0);
        a1.validate(5);
        a1.arr();
    }
}
