package Exp_7_2010070;

import java.util.Scanner;

public class Exp_7_1 {

    Exp_7_1()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First number : ");
        int n1 = in.nextInt();
        System.out.println("Enter Second number : ");
        int n2 = in.nextInt();

        try
        {
            System.out.println("Division of "+n1+" and "+n2+" is :"+n1/n2);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        Exp_7_1 e1 = new Exp_7_1();
    }
}
