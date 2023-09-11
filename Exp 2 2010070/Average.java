// 1)	Print the average of three numbers entered by user by creating a class named 'Average' having a method
// to calculate and print the average.

import java.util.*;

public class Average{

    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        Average_no a1 = new Average_no();
        a1.avg(a, b,c);
    }
}

class Average_no{

    void avg(int x, int y, int z){
        float aveg;
        aveg=(x+y+z)/3;
        System.out.println("Average is :"+aveg);
    } 
}