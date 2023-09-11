// 6c) Check whether entered number is palindrome or not
     
import java.util.*;
public class Pallindrome{
    public static void main(String[] args) {
    
        int num, rnum =0;
        Scanner in = new Scanner(System.in);
    
        System.out.println("Enter the number you want to check :");
        num = in.nextInt();
        int temp = num;
        while(num!=0)
        {
           int r = num%10; 
           rnum = rnum* 10+r;
           num = num/10;
        }

        if (temp==rnum)
        {
            System.out.println("Pallindrome.");
        }
        else{
            System.out.println("Not Pallindrome.");
        }      
    }
}