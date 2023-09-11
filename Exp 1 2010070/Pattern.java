// 6f) Print the any * pattern using for loop
//        *
//        **
//        ***
//        ****
//        *****

import java.util.*;
public class Pattern{
    public static void main(String[] args) {
    
        int i ,j,n ;
        Scanner in = new Scanner(System.in);  
        System.out.println("Enter the number of rows :");
        n = in.nextInt();

        for(i=1; i<=n;i++)
        {
            for(j=1 ; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }      
    }
}