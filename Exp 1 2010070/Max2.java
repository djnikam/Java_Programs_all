// -5b)Implement a java program to find the maximum among two number using the ternary operator
import java.util.*;

public class Max2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float a, b, max;

        System.out.println("Enter two Numbers :");
        a = input.nextFloat();
        b = input.nextFloat();

        max = (a>b)? a:b;
        System.out.println("Maximum is :"+max);

    }
    
}
