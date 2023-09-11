package Exp_6_2010070;
import java.util.*;

public class Error
{
    public static void main(String[] args)
    {
        Hashtable<Integer,String> h1 = new Hashtable<Integer ,String>();
        h1.put(1,"Shubham");
        h1.put(2,"Onkar");
        h1.put(3,"Bhushan");
        h1.put(4,"Omkar");
        h1.put(5,"Dhanraj");

        System.out.println(h1);
        System.out.println(h1.get(3));
        h1.remove(2);
        System.out.println(h1);

//        h1.replace(1,"Shubham","Nikhil");
        System.out.println(h1);
    }
}
