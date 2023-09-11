// 2)	Implement the java program to perform the find the addition of two numbers

import java.util.*;

public class _2addition{
    public static void main(String[] args) {

    int a, b, sum;    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Two Numbers :");
    a=input.nextInt();
    b=input.nextInt();

    sum = a+b;
    System.out.println("Addition of two Numbers is :"+sum);

    }
}