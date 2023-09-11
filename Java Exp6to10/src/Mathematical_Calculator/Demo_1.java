package Mathematical_Calculator;
import java.util.Scanner;

public class Demo_1 {
    public static void main(String[] args)
    {
     addition a1 = new addition();
     substration a2 = new substration();
     multiplication a3 = new multiplication();
     division a4 = new division();
     Scanner input = new Scanner(System.in);
     float A = input.nextFloat();
     float B = input.nextFloat();
        System.out.println(a1.Addition(A,B));
        System.out.println(a2.Substration(A,B));
        System.out.println(a3.Multiplication(A,B));
        System.out.println(a4.Division(A,B));
    }
}