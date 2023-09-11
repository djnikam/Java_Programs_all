// -5A) Implement java program for mathematical calculator (take the input at run time using the scanner class in java)
// Note: take operator and operands as input from user. 

import java.util.*;

public class calculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float a,b,sum,div,sub,mul,mod;

        System.out.println("Enter Two Numbers :");
        a = input.nextFloat();
        b = input.nextFloat();

        sum = a+b;
        sub = a-b;
        mul = a*b;
        div = a/b;
        mod = a%b;

        System.out.println("Addition is :"+sum);
        System.out.println("Substraction is :"+sub);
        System.out.println("Multiplication is :"+mul);
        System.out.println("Division is :"+div);
        System.out.println("Modulos is :"+mod);
    }  
}
