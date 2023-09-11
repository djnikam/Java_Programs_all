// 6A) Find maximum among three numbers.

import java.util.*;

public class max3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float a, b,c, max;

        System.out.println("Enter Three Numbers :");
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();

        max = (a>b)? (a>c? a:c):(b>c? b:c);
        System.out.println("Maximum is :"+max);

    }
    
}